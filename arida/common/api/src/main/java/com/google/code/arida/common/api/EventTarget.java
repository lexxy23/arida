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
package com.google.code.arida.common.api;

import java.io.Serializable;

/**
 * A raid target. An instance or battlefield, or something like that. This is
 * typically a constant or can vary according to the game. Usually Arida starts
 * with a set of event targets. But more targets can be added manually via the
 * admin console
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface EventTarget extends Serializable {
	/**
	 * Returns the id of the entry.
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the title of the target
	 * 
	 * @param l
	 *            the language of the title
	 * 
	 * @return the title of the target
	 */
	public String getTitle();

	/**
	 * Returns a possible short code for the given event target.
	 * 
	 * @return null, or a short code
	 */
	public String getShortCode();

	/**
	 * Returns a description of the target
	 * 
	 * @param l
	 *            the language of the description
	 * 
	 * @return a possible description, or null
	 */
	public String getDescr();

	/**
	 * Returns the minimum player character level for this target to get
	 * considered.
	 * 
	 * @return the minimum player level, or -1 if not applicable
	 */
	public int getMinLevel();

}
