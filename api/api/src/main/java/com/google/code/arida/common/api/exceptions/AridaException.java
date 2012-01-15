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
package com.google.code.arida.common.api.exceptions;

/**
 * The base exception for any arida related errors.
 * 
 * @author kaeto23
 * 
 */
public class AridaException extends Exception {

	/**
	 * The svuid.
	 */
	private static final long serialVersionUID = 8232186651552537749L;

	/**
	 * Inits the exception with the given message.
	 * 
	 * @param message
	 *            the message to display
	 */
	public AridaException(final String message) {
		super(message);
	}

	/**
	 * Inits the exception with the given message and base exception.
	 * 
	 * @param message
	 *            the message to display
	 * @param cause
	 *            the root exception
	 */
	public AridaException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
