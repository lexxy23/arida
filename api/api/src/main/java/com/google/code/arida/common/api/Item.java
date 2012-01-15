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
package com.google.code.arida.common.api;

import java.util.Locale;

/**
 * An item. Basically, this can be everything starting from ammunition up to set
 * items.
 * 
 * @author kaeto23
 * 
 */
public interface Item {
	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the item id according to the game
	 * 
	 * @return the item id according to the game
	 */
	public String getGameItemId();

	/**
	 * Returns the name of the item
	 * 
	 * @param l
	 *            the locale to get the title for
	 * 
	 * @return the name of the item
	 */
	public String getTitle(Locale l);
}
