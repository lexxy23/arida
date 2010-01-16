/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009,2010  Dirk Strauss
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

/**
 * An event template. This template typically is read-only (except when
 * created). Values can be overridden by the {@link Event} itself.
 * 
 * @author kaeto23
 * 
 */
public interface EventTemplate extends Serializable {
	/**
	 * Returns the target of the event
	 * 
	 * @return the event target
	 */
	public EventTarget getTarget();

	/**
	 * Returns the id of the template
	 * 
	 * @return the id of the template
	 */
	public long getId();

	/**
	 * Returns the raid this template belongs to
	 * 
	 * @return the raid this template belongs to
	 */
	public Raid getRaid();

	/**
	 * Returns the possible count of the given class role
	 * 
	 * @param r
	 *            the role
	 * @return a possible allowed count for the given class role
	 */
	public int getCountOfRole(ClassRole r);

	/**
	 * Returns the minimum level for a player character to join.
	 * 
	 * @return the minimum level, or -1 if not applicable or not necessary
	 */
	public int getMinLevel();

	/**
	 * Returns the maximum level for a player character to join.
	 * 
	 * @return the maximum level, or -1 if not applicable or not necessary
	 */
	public int getMaxLevel();
}
