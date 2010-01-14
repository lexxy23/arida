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
package com.google.code.arida.common.baseimpl.games;

import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.logging.Logger;

import com.google.arida.i18n.I18nService;
import com.google.code.arida.common.api.Game;
import com.google.inject.Inject;

/**
 * An abstract implementation for game implementations. If you ever need to
 * write additional games support, this class is for you.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public abstract class AbstractGame implements Game {
	/**
	 * A logger.
	 */
	protected static final Logger LOG = Logger.getLogger(AbstractGame.class
			.getName());
	/**
	 * Some game properties.
	 */
	protected Properties props;
	/**
	 * The i18n service.
	 */
	@Inject
	protected I18nService i18n;
	/**
	 * The game id, or short code. This identifier is used on the whole platform
	 * to identify this game.
	 */
	private String gameIdentifier;

	/**
	 * Creates an abstract game using the given property file to load.
	 * 
	 * @param gameId
	 *            the game id, or short code to identify this game.
	 * 
	 * @param propertyFile
	 *            the property file to load.
	 */
	protected AbstractGame(final String gameId, final String propertyFile) {
		props = new Properties();
		final InputStream is = getClass().getResourceAsStream(propertyFile);
		if (is != null) {
			try {
				props.load(is);
			} catch (final IOException e) {
				LOG.warning("Loading of resources from " + propertyFile
						+ " failed! " + e.getLocalizedMessage());
				LOG.throwing(WoW.class.getName(), "<init>", e);
			} finally {
				try {
					is.close();
				} catch (final IOException e) {
					LOG
							.finer("An error occurred when closing the input stream: "
									+ e.getLocalizedMessage());
				}
			}
		} else {
			LOG.warning("Could not load main resource " + propertyFile + "!");
			throw new MissingResourceException(
					"Could not find " + propertyFile, AbstractGame.class
							.getName(), "nokey");
		}
		this.gameIdentifier = gameId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getShortCode() {
		return gameIdentifier;
	}

}
