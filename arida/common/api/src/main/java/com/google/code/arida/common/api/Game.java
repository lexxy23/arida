/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009,2010  Dirk Strauss
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

import java.util.Locale;
import java.util.Set;

/**
 * A game. Implementations of this class must not contain any player-dependable
 * information. It is considered that the implementation contains only abstract
 * information about the game.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface Game {
	/**
	 * returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	long getId();

	/**
	 * Returns the title of the game
	 * 
	 * @return the title of the game
	 */
	String getTitle(Locale l);

	/**
	 * Returns a possible shortcode for the game. This short code is also used
	 * in the frontend to load appropriate graphics.
	 * 
	 * @return null, or a possible short code for the game
	 */
	String getShortCode();

	/**
	 * Returns all known character types of this game
	 * 
	 * @return all known character types of this game
	 */
	Set<CharacterType> getTypes(Locale l);

	/**
	 * Returns the name of a group of characters according to the game
	 * 
	 * @param l
	 *            the locale
	 * @return something like Guild (in WoW) or Clan (in CS)
	 */
	String getGuildTitle(Locale l);

	/**
	 * Returns a list of possible ingame targets (instances, battlefields etc)
	 * 
	 * @return an empty list, or a list of event targets
	 */
	Set<EventTarget> getEventTargets(Locale l);
}
