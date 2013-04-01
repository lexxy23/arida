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

import java.net.URL;
import java.util.Set;

import ds2.oss.core.api.Persistable;

/**
 * The raid group. Also known as the Order.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface Raid extends Identifyable, Persistable<Long> {
    /**
     * This ID typically reflects the raid order name. A title like Circle of
     * Phoenix may return COP.
     * 
     * @return the order id
     */
    String getOrderId();
    
    /**
     * Returns the title of the order.
     * 
     * @return the title of the order
     */
    String getTitle();
    
    /**
     * Returns the description of the order.
     * 
     * @return a small sub title of the order
     */
    String getDescr();
    
    /**
     * Returns the lead character of this order.
     * 
     * @return the lead character of this order
     */
    PlayerCharacter getLeader();
    
    /**
     * Returns the raid order officers.
     * 
     * @return an empty list, or a set of raid officers
     */
    Set<PlayerCharacter> getOfficers();
    
    /**
     * Returns all known members of the raid order.
     * 
     * @return all known members
     */
    Set<PlayerCharacter> getMembers();
    
    /**
     * Returns the basic type of this order.
     * 
     * @return the basic type of this order
     */
    ValueSystem getInitialValueType();
    
    /**
     * Returns a possible forum url.
     * 
     * @return null, or a forum url of this raid
     */
    URL getForumUrl();
    
    /**
     * Returns the game this raid belongs to.
     * 
     * @return null, or the game of this raid
     */
    Game getGame();
}
