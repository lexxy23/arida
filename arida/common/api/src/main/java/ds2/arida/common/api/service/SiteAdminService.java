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
/**
 * 
 */
package ds2.arida.common.api.service;

import java.util.Set;

import ds2.arida.common.api.CharacterType;
import ds2.arida.common.api.Game;
import ds2.arida.common.api.Guild;
import ds2.arida.common.api.SiteAdminRights;

/**
 * Service for managing the site
 * 
 * @author kaeto23
 * 
 */
public interface SiteAdminService {
	/**
	 * Sets the site offline or online
	 * 
	 * @param b
	 *            the flag to indicate the offline state of the web site
	 * @return the current state
	 */
	public boolean setOffline(boolean b);

	/**
	 * Creates a guild or clan
	 * 
	 * @param gameId
	 *            the id of the game
	 * @param title
	 *            the title of the clan
	 * @param clanPrefix
	 *            a clan prefix, null is allowed
	 * @return null, or the created guild
	 */
	public Guild createGuild(long gameId, String title, String clanPrefix);

	/**
	 * Updates a guild
	 * 
	 * @param g
	 *            the guild to update
	 * @return TRUE if the update was successful, otherwise FALSE
	 */
	public boolean updateGuild(Guild g);

	/**
	 * Deletes a guild or clan
	 * 
	 * @param guildId
	 *            the id of the clan
	 * @return TRUE if delete was successful, othewise FALSE
	 */
	public boolean deleteGuild(long guildId);

	/**
	 * Adds a character to a guild
	 * 
	 * @param characterId
	 *            the id of the character
	 * @param guildId
	 *            the id of the guild
	 * @return TRUE if association was successful, otherwise FALSE
	 */
	public boolean addCharacterToGuild(long characterId, long guildId);

	/**
	 * Removes the given character from the guild
	 * 
	 * @param characterId
	 *            the id of the character
	 * @return TRUE if successful, otherwise FALSE
	 */
	public boolean leaveGuild(long characterId);

	/**
	 * Creates a game
	 * 
	 * @param title
	 *            the name of the game
	 * @param shortCode
	 *            a shortcode
	 * @return null, or the game info
	 */
	public Game createGame(String title, String shortCode);

	/**
	 * Returns the game with the given short code
	 * 
	 * @param shortCode
	 *            the short code of the game
	 * @return null, or the game
	 */
	public Game getGameByShortcode(String shortCode);

	/**
	 * Returns the game with the given id
	 * 
	 * @param id
	 *            the id of the game
	 * @return null, or the game
	 */
	public Game getGameById(long id);

	/**
	 * Returns a set of game short codes.
	 * 
	 * @return an empty set, or a set of game short codes
	 */
	public Set<String> getGameShortcodes();

	/**
	 * Adds a character type to the game
	 * 
	 * @param t
	 *            the type of the character
	 * @param gameId
	 *            the id of the game
	 * @return the updated character type, or null
	 */
	public CharacterType createCharacterType(CharacterType t, long gameId);

	/**
	 * Updates the given character type
	 * 
	 * @param t
	 *            the type to update
	 * @return TRUE if update was successful, otherwise FALSE
	 */
	public boolean updateCharacterType(CharacterType t);

	/**
	 * Sets some rights for the website management.
	 * 
	 * @param r
	 *            the right to change
	 * @param b
	 *            the flag to enable or disable the right
	 * @return TRUE if right setting was successful, otherwise FALSE
	 */
	public boolean setSiteRights(SiteAdminRights r, boolean b);
}
