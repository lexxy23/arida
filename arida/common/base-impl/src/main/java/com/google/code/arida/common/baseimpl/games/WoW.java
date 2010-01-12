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
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Logger;

import com.google.code.arida.common.api.CharacterType;
import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.api.Game;
import com.google.inject.Singleton;

/**
 * The property implementation for the mmorpg world of warcraft.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
@Singleton
public class WoW implements Game {
	private static final String RESOURCE = "/com/google/code/arida/common/baseimpl/game-wow";
	private ResourceBundle rb = null;
	private Properties props = null;
	/**
	 * A logger.
	 */
	private static final transient Logger LOG = Logger.getLogger(WoW.class
			.getName());

	public WoW() {
		props = new Properties();
		InputStream is = getClass()
				.getResourceAsStream(
						"/com/google/code/arida/common/baseimpl/game-wow-keys.properties");
		if (is != null) {
			try {
				props.load(is);
			} catch (IOException e) {
				LOG.throwing(WoW.class.getName(), "<init>", e);
			}
		}

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<EventTarget> getGameTargets() {
		String targets = props.getProperty("game.targets");
		Set<EventTarget> rc = new HashSet<EventTarget>();
		if (targets == null || targets.length() <= 0) {
			LOG.info("Nothing found!");
			return rc;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getGuildTitle(Locale l) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getShortCode() {
		return "wow";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTitle() {
		return "World of Warcraft";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<CharacterType> getTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
