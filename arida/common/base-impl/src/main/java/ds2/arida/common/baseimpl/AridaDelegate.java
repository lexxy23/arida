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
package ds2.arida.common.baseimpl;

import java.util.logging.Logger;

import com.google.inject.Guice;

import ds2.arida.common.api.service.AuthenticationService;
import ds2.arida.common.baseimpl.modules.AridaInjectModule;

/**
 * The delegate to access most of the services
 * 
 * @author kaeto23
 * 
 */
public class AridaDelegate {
	/**
	 * a logger
	 */
	private static final transient Logger log = Logger
			.getLogger(AridaDelegate.class.getName());

	/**
	 * Returns an instance of the given service
	 * 
	 * @return null, or an implementation of the AuthenticationService
	 */
	public AuthenticationService getService() {
		AuthenticationService rc = null;
		rc = Guice.createInjector(new AridaInjectModule()).getInstance(
				AuthenticationService.class);
		if (rc == null) {
			log.warning("returning null!!");
		}
		return rc;
	}
}
