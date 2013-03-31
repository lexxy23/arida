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
package com.google.code.arida.common.api;

/**
 * A player character type. This interface is especially for Runes of Magic
 * where a player character can have multiple (read: two) classes. This
 * interface also tells the level of the player character.
 * 
 * @author kaeto23
 * 
 */
public interface PlayerCharacterType {
	/**
	 * Returns the type of the players's character.
	 * 
	 * @return the type
	 */
	public CharacterType getType();

	/**
	 * Returns the level of the player char type
	 * 
	 * @return the level, or -1 if not applicable
	 */
	public int getLevel();
}
