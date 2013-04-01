/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2009-2013  Dirk Strauss
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

import ds2.oss.core.api.Persistable;

/**
 * An item. Basically, this can be everything starting from ammunition up to set
 * items.
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface Item extends Persistable<Long> {
    
    /**
     * Returns the item id according to the game.
     * 
     * @return the item id according to the game
     */
    String getGameItemId();
    
    /**
     * Returns the name of the item.
     * 
     * @param l
     *            the locale to get the title for
     * 
     * @return the name of the item
     */
    String getTitle(Locale l);
}
