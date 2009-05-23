/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009  Dirk Strauss
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
 * The type or class of a character. Implementations of this interface must not
 * add player-dependable information.
 * 
 * @author kaeto23
 * 
 */
public interface CharacterType {
	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the title of the character type. Something like Priest or Warrior
	 * 
	 * @param l
	 *            the locale to use for the title
	 * 
	 * @return the title of the character type
	 */
	public String getTitle(Locale l);

	/**
	 * Returns a list of possible types of this type
	 * 
	 * @return returns a set of classifiers for this type
	 */
	public Set<ClassRole> getAllowedRoles();

	/**
	 * Returns the game this type belongs to
	 * 
	 * @return the game
	 */
	public Game getGame();
}
