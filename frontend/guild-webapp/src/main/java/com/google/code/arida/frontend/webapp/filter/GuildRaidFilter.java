/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2009-2013  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.google.code.arida.frontend.webapp.filter;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.code.arida.common.api.Guild;
import com.google.code.arida.common.api.Raid;
import com.google.code.arida.common.api.service.GuildService;
import com.google.code.arida.common.api.service.RaidAdminService;
import com.google.code.arida.common.api.service.RaidService;
import com.google.code.arida.frontend.common.api.RequestAttributes;

/**
 * A filter to load a guild by a given name, and then forwarding the request to
 * the JSF implementation.
 * 
 * @author Dirk Strauss
 * @version 0.1
 */
@WebFilter(urlPatterns = "/*", dispatcherTypes = DispatcherType.REQUEST)
public class GuildRaidFilter implements Filter {
    /**
     * A logger.
     */
    private static final Logger LOG = LoggerFactory
        .getLogger(GuildRaidFilter.class);
    /**
     * The pattern for a guild tag.
     */
    private static final Pattern GUILDTAGPATTERN = Pattern.compile("^/g/c/"
        + RaidAdminService.GUILDTAGPATTERN.pattern() + "/");
    /**
     * The guild service.
     */
    @Inject
    private GuildService guildSvc;
    /**
     * The raid service.
     */
    @Inject
    private RaidService raidSvc;
    
    /**
     * Inits the filter.
     */
    public GuildRaidFilter() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void destroy() {
        LOG.info("Exiting filter");
    }
    
    @Override
    public void doFilter(final ServletRequest arg0, final ServletResponse arg1,
        final FilterChain arg2) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) arg0;
        String reqUri = req.getRequestURI();
        LOG.debug("reqUri is {}", reqUri);
        if (isWebpageRequest(reqUri)) {
            Matcher m = GUILDTAGPATTERN.matcher(reqUri);
            if (!m.find()) {
                throw new ServletException(
                    "Could not find the given guild or clan!");
            }
            String g1 = m.group();
            Matcher guildNameMatcher =
                RaidAdminService.GUILDTAGPATTERN.matcher(g1);
            guildNameMatcher.find();
            String guildName = guildNameMatcher.group();
            LOG.debug("guildName is {}", guildName);
            Guild guild = guildSvc.getGuildByTag(guildName);
            if (guild == null) {
                Raid r = raidSvc.getRaidByOrderId(guildName);
                if (r == null) {
                    throw new ServletException(
                        "No clan or raid found with the given id!");
                }
                arg0.setAttribute(RequestAttributes.RAID.name(), r);
            } else {
                arg0.setAttribute(RequestAttributes.GUILD.name(), guild);
            }
            RequestDispatcher dispatcher =
                req.getRequestDispatcher("/c/index.jsf");
            dispatcher.forward(arg0, arg1);
        } else {
            LOG.debug("pass through {}", reqUri);
            arg2.doFilter(arg0, arg1);
        }
    }
    
    /**
     * Simple check if the incoming request is for a real web page.
     * 
     * @param reqUri
     *            the request uri
     * @return TRUE if it's for a web page, otherwise FALSE
     */
    private static boolean isWebpageRequest(final String reqUri) {
        LOG.debug("Entering with {}", reqUri);
        boolean rc = false;
        if (reqUri.indexOf("javax.faces.resource") > 0) {
            rc = false;
        } else {
            Matcher m = GUILDTAGPATTERN.matcher(reqUri);
            if (m.find()) {
                rc = true;
            }
        }
        LOG.debug("Exiting with {}", Boolean.valueOf(rc));
        return rc;
    }
    
    @Override
    public void init(final FilterConfig arg0) throws ServletException {
        LOG.info("Powering up");
    }
    
}
