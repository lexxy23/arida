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
package com.google.code.arida.common.api.service;

import java.util.Set;

import com.google.code.arida.common.api.Game;
import com.google.code.arida.common.api.Guild;
import com.google.code.arida.common.api.Raid;

/**
 * A service for reports regarding the arida platform.
 * 
 * @author Dirk Strauss
 * @version 0.1
 */
public interface BusinessReportingService {
    /**
     * Returns the number of accounts.
     * 
     * @return the number of all accounts
     */
    int getAccountCount();
    
    /**
     * Returns the count of games installed into the platform.
     * 
     * @return the games count
     */
    int getGamesCount();
    
    /**
     * Returns all installed games.
     * 
     * @return all installed games
     */
    Set<Game> getGames();
    
    /**
     * Returns all installed guilds or clans.
     * 
     * @return all guilds or clans
     */
    Set<Guild> getGuilds();
    
    /**
     * Returns all raids running on the server.
     * 
     * @return all raids running on the server
     */
    Set<Raid> getRaids();
}
