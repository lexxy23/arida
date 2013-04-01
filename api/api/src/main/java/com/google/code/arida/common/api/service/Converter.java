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
/**
 * 
 */
package com.google.code.arida.common.api.service;

/**
 * A converter for some basic conversions (string to int, etc.).
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface Converter {
	/**
	 * Performs an integer conversion of the given string.
	 * 
	 * @param s
	 *            the string which is expected to be a int value
	 * @param def
	 *            a default value in case the conversion fails
	 * @return the default value, or the parsed int value
	 */
	int toInt(String s, int def);
}
