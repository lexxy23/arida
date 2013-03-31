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
 * The base exception for any arida related errors.
 * 
 * @author Dirk Strauss
 * @version 0.1
 */
public class AridaException extends Exception {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 8232186651552537749L;
    /**
     * The error code.
     */
    private final AridaErrorCode errorCode;
    
    /**
     * Inits the exception with the given message.
     * 
     * @param ec
     *            the error code
     * 
     * @param message
     *            the message to display
     */
    public AridaException(final AridaErrorCode ec, final String message) {
        super(message);
        errorCode = ec;
    }
    
    /**
     * Inits the exception with the given message and base exception.
     * 
     * @param ec
     *            The error code
     * 
     * @param message
     *            the message to display
     * @param cause
     *            the root exception
     */
    public AridaException(final AridaErrorCode ec, final String message,
        final Throwable cause) {
        super(message, cause);
        errorCode = ec;
    }
    
    /**
     * Returns the error code for this excpetion.
     * 
     * @return the error code
     */
    public AridaErrorCode getErrorCode() {
        return errorCode;
    }
    
}
