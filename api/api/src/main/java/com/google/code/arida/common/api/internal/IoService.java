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
package com.google.code.arida.common.api.internal;

import java.io.InputStream;

/**
 * The io service support.
 * 
 * @author Dirk Strauss
 * @version 0.1
 * @deprecated Better use the DS2 OSS Core IoService.
 */
@Deprecated
public interface IoService {
    /**
     * Closes the given input stream.
     * 
     * @param is
     *            the input stream to close
     */
    void close(InputStream is);
}
