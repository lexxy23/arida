/**
 * 
 */
package com.google.code.arida.gameconfig.api;

import java.util.List;
import java.util.Locale;

import com.google.code.arida.common.api.Game;
import com.google.code.arida.common.api.exceptions.GameInitException;

/**
 * The loader contract to load all known games.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface GameConfigLoaderService {
	/**
	 * Returns all known game ids loadable by this loader.
	 * 
	 * @return a list of game ids, or an empty list.
	 * @throws GameInitException
	 *             if an error occurred
	 */
	List<String> getGameIds() throws GameInitException;

	/**
	 * Loads some game data with the given id and locale.
	 * 
	 * @param id
	 *            the id of the game
	 * @param l
	 *            the locale to use.
	 * @return the game data, or null if nothing was found.
	 * @throws GameInitException
	 *             if an error occurred.
	 */
	Game loadGameData(String id, Locale l) throws GameInitException;

	/**
	 * Returns all known games.
	 * 
	 * @param l
	 *            the locale to use for loading the game data
	 * 
	 * @return a list with all known games, or an empty list.
	 * @throws GameInitException
	 *             if an error occurred.
	 */
	List<Game> loadGames(Locale l) throws GameInitException;
}
