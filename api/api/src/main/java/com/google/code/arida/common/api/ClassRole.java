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
package com.google.code.arida.common.api;

import ds2.oss.core.api.Persistable;

/**
 * The role of a class. This can be tank, MeleeDD or healer. Whatever the game
 * has to offer.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface ClassRole extends Persistable<Long> {
    
    /**
     * Returns the name of the role.
     * 
     * @return the name of the role
     */
    String getTitle();
    
    /**
     * Returns a possible description of the role.
     * 
     * @return null, or a description of the role
     */
    String getDescription();
    
    /**
     * Returns a short code for this role.
     * 
     * @return a short code for this role
     */
    String getShortcode();
}
