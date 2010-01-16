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
 * A rang of a character within a clan or guild. Usually, a character can have a
 * given rang within a guild which expresses partly the access level of the
 * character.
 * 
 * @author kaeto23
 * 
 */
public interface GuildRang extends Serializable {
	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns a possible order number for ordering the rangs
	 * 
	 * @return 0, or a possible order number
	 */
	public int getOrderNumber();

	/**
	 * Returns the title of the rang
	 * 
	 * @return the title of the rang
	 */
	public String getTitle();
}
