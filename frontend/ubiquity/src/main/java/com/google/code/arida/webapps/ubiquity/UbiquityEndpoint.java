/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009-2011  Dirk Strauss
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
package com.google.code.arida.webapps.ubiquity;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author kaeto23
 * 
 */
@WebServlet(
    name = "ubiquityEndpoint",
    displayName = "Ubiquity Endpoint",
    loadOnStartup = 1,
    description = "The endpoint to send ubiquity data to")
public class UbiquityEndpoint extends HttpServlet {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 7572602451428260248L;
    
    /**
	 * 
	 */
    public UbiquityEndpoint() {
        // TODO Auto-generated constructor stub
    }
    
}
