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
package ds2.arida.common.api;

/**
 * A raid character.
 * 
 * @author kaeto23
 * 
 */
public interface Character {
	/**
	 * Returns the name of the character
	 * 
	 * @return the name of the character
	 */
	public String getCharName();

	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the type of the character
	 * 
	 * @return the type of the character
	 */
	public CharacterType getType();

	/**
	 * Returns the guild or clan of this character
	 * 
	 * @return the guild or clan of this character, or null
	 */
	public Guild getGuild();

	/**
	 * Flag to indicate that this character is hibernated and should not be
	 * displayed in any queries.
	 * 
	 * @return TRUE if this character is hibernated, otherwise FALSE
	 */
	public boolean isHibernated();

	/**
	 * Returns the deletion flag
	 * 
	 * @return TRUE if this character is deleted, otherwise FALSE
	 */
	public boolean isDeleted();

	/**
	 * If the current character has been renamed, this method will return the
	 * new character.
	 * 
	 * @return null, or the new character
	 */
	public Character getRenamedCharacter();
}
