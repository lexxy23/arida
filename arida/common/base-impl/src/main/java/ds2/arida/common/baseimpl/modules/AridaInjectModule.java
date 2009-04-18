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
package ds2.arida.common.baseimpl.modules;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;

import ds2.arida.common.api.service.AuthenticationService;
import ds2.arida.common.baseimpl.svc.AuthenticationServiceImpl;

/**
 * The inject module for binding interfaces to implementations
 * 
 * @author kaeto23
 * 
 */
public class AridaInjectModule implements Module {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void configure(Binder arg0) {
		arg0.bind(AuthenticationService.class).to(
				AuthenticationServiceImpl.class).in(Scopes.SINGLETON);
	}

}
