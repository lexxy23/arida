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
/**
 * 
 */
package com.google.code.arida.common.baseimpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import com.google.code.arida.common.api.internal.IoService;

/**
 * @author kaeto23
 * 
 */
public class IoServiceImpl implements IoService {
	/**
	 * A logger.
	 */
	private static final Logger log = Logger.getLogger(IoServiceImpl.class
			.getName());

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void close(InputStream is) {
		try {
			is.close();
		} catch (IOException e) {
			log.info(e.getLocalizedMessage());
		}
	}

}
