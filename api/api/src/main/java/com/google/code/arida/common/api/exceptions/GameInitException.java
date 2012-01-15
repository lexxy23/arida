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
 * An exception for game loader problems.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class GameInitException extends AridaException {

	/**
	 * The svuid.
	 */
	private static final long serialVersionUID = -6056225354856011260L;

	/**
	 * Inits the exception with the given message.
	 * 
	 * @param message
	 *            the message
	 */
	public GameInitException(final String message) {
		super(message);
	}

	/**
	 * Inits the exception with the given message and cause.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause of the problem
	 */
	public GameInitException(final String message, final Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
