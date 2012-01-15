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
/**
 * 
 */
package com.google.code.arida.common.baseimpl;

import java.util.HashSet;
import java.util.Set;

import com.google.code.arida.common.api.CharacterType;
import com.google.code.arida.common.api.ClassRole;
import com.google.code.arida.common.api.Game;

/**
 * A character type dto.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class CharacterTypeDto implements CharacterType {
	/**
	 * The svuid.
	 */
	private static final long serialVersionUID = -3124430708178337797L;
	private Set<ClassRole> allowedRoles = null;
	private Game game;
	private long id;
	private String title;
	private String description;

	public CharacterTypeDto() {
		allowedRoles = new HashSet<ClassRole>();
	}

	public void addClassRole(ClassRole r) {
		allowedRoles.add(r);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<ClassRole> getAllowedRoles() {
		return allowedRoles;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Game getGame() {
		return game;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * @param game
	 *            the game to set
	 */
	public synchronized void setGame(Game game) {
		this.game = game;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public synchronized void setId(long id) {
		this.id = id;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public synchronized void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public synchronized void setDescription(String description) {
		this.description = description;
	}

}
