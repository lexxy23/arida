/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2013  Dirk Strauss
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

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple servlet context listener.
 * 
 * @author Dirk Strauss
 * @version 0.1
 */
@WebListener
public class StartupListener implements ServletContextListener {
    /**
     * A logger.
     */
    private static final Logger LOG = LoggerFactory
        .getLogger(StartupListener.class);
    
    /**
     * Inits the listener.
     */
    public StartupListener() {
        // TODO Auto-generated constructor stub
    }
    
    /*
     * (non-Javadoc) @see
     * javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.
     * ServletContextEvent)
     */
    @Override
    public void contextDestroyed(final ServletContextEvent arg0) {
        LOG.info("Arida shuts down ...");
    }
    
    /*
     * (non-Javadoc) @see
     * javax.servlet.ServletContextListener#contextInitialized(javax.servlet
     * .ServletContextEvent)
     */
    @Override
    public void contextInitialized(final ServletContextEvent arg0) {
        LOG.info("Arida starts up...");
    }
}
