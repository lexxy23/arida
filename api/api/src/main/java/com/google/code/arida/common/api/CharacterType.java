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
package com.google.code.arida.common.api;

import java.io.Serializable;
import java.util.Set;

/**
 * The type or class of a character. Implementations of this interface must not
 * add player-dependable information. Some examples are warrior, dk, medic,
 * sniper etc.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface CharacterType extends Serializable {
	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	long getId();

	/**
	 * Returns the title of the character type. Something like Priest or Warrior
	 * 
	 * @return the title of the character type
	 */
	String getTitle();

	/**
	 * Returns the description of the character.
	 * 
	 * @return a description
	 */
	String getDescription();

	/**
	 * Returns a list of possible types of this type
	 * 
	 * @return returns a set of classifiers for this type
	 */
	Set<ClassRole> getAllowedRoles();

	/**
	 * Returns the game this type belongs to
	 * 
	 * @return the game
	 */
	Game getGame();
}
