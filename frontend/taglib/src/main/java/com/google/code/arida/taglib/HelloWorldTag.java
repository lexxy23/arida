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
/**
 * 
 */
package com.google.code.arida.taglib;

import java.io.IOException;

import javax.faces.FacesException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 * @author dstrauss
 * 
 */
@FacesComponent("arida.hw")
public class HelloWorldTag extends UIOutput {
    
    /**
     * 
     */
    public HelloWorldTag() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void encodeAll(FacesContext arg0) throws IOException {
        ResponseWriter writer = arg0.getResponseWriter();
        String viewName;
        
        try {
            viewName = this.getAttributes().get("viewName").toString();
        } catch (NullPointerException e) {
            throw new FacesException(
                "Must supply viewName, libraryName and resourceName attributes");
        }
        writer.writeComment("hi, " + viewName);
    }
}
