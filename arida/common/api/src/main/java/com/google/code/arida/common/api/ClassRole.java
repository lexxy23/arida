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

import java.util.Locale;

/**
 * The role of a class. This can be tank, MeleeDD or healer. Whatever the game
 * has to offer
 * 
 * @author kaeto23
 * 
 */
public interface ClassRole {
	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the name of the role
	 * 
	 * @param l
	 *            the language of the title
	 * 
	 * @return the name of the role
	 */
	public String getTitle(Locale l);

	/**
	 * Returns a possible description of the role
	 * 
	 * @param l
	 *            the language of the title
	 * 
	 * @return null, or a description of the role
	 */
	public String getDescription(Locale l);
}
