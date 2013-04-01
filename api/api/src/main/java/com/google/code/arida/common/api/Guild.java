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

import java.util.List;

import ds2.oss.core.api.Persistable;

/**
 * A guild or a clan.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface Guild extends Identifyable, Persistable<Long> {
    
    /**
     * Returns a possible clan prefix.
     * 
     * @return a clan prefix, or null
     */
    String getClanTag();
    
    /**
     * Returns the name of the guild or clan.
     * 
     * @return the name
     */
    String getTitle();
    
    /**
     * Returns all known guild members.
     * 
     * @return all known guild members
     */
    List<GuildMember> getMembers();
    
    /**
     * Returns the id of the game this clan belongs to.
     * 
     * @return the id of the game
     */
    long getGameId();
}
