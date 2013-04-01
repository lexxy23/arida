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
/**
 * 
 */
package com.google.code.arida.frontend.common.impl;

import javax.enterprise.context.ApplicationScoped;

import com.google.code.arida.frontend.common.api.FrontendData;

/**
 * Some known data about the location of the frontends.
 * 
 * @author Dirk Strauss
 * @version 0.1
 */
@ApplicationScoped
public class FrontendDataImpl implements FrontendData {
    
    /**
     * The context path.
     */
    private String contextPath;
    
    /**
     * Inits the service.
     */
    public FrontendDataImpl() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String getContextPath() {
        return contextPath;
    }
    
    @Override
    public void setContextPath(final String s) {
        contextPath = s;
    }
    
}
