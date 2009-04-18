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

import java.util.Locale;
import java.util.Set;

/**
 * A game
 * 
 * @author kaeto23
 * 
 */
public interface Game {
	/**
	 * returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the title of the game
	 * 
	 * @return the title of the game
	 */
	public String getTitle();

	/**
	 * Returns a possible shortcode for the game
	 * 
	 * @return null, or a possible short code for the game
	 */
	public String getShortCode();

	/**
	 * Returns all known character types of this game
	 * 
	 * @return all known character types of this game
	 */
	public Set<CharacterType> getTypes();

	/**
	 * Returns the name of a group of characters according to the game
	 * 
	 * @param l
	 *            the locale
	 * @return something like Guild (in WoW) or Clan (in CS)
	 */
	public String getGuildTitle(Locale l);

	/**
	 * Returns a list of possible ingame targets (instances, battlefields etc)
	 * 
	 * @return an empty list, or a list of event targets
	 */
	public Set<EventTarget> getGameTargets();
}
