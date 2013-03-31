/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2013  Dirk Strauss
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
package com.google.code.arida.common.api.exceptions;

/**
 * Some known errors appearing in arida.
 * 
 * @author dstrauss
 * @version 0.1
 */
public enum AridaErrorCode {
    /**
     * If the game initialization failed.
     */
    GameInitFailed(1),
    /**
     * If a requested guild or clan could not be found.
     */
    GuildOrClanNotFound(2);
    /**
     * The numerical error code.
     */
    private int code;
    
    /**
     * Inits the error code.
     * 
     * @param i
     *            the error code id
     */
    private AridaErrorCode(final int i) {
        code = i;
    }
    
    /**
     * Returns the error code of this enum value.
     * 
     * @return the numerical error code
     */
    public int getErrorCode() {
        return code;
    }
}
