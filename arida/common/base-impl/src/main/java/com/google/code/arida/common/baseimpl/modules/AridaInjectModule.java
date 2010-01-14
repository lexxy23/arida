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
package com.google.code.arida.common.baseimpl.modules;

import com.google.arida.i18n.I18nService;
import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.api.Game;
import com.google.code.arida.common.api.internal.IoService;
import com.google.code.arida.common.api.service.AuthenticationService;
import com.google.code.arida.common.api.service.Converter;
import com.google.code.arida.common.baseimpl.ConverterImpl;
import com.google.code.arida.common.baseimpl.EventTargetDto;
import com.google.code.arida.common.baseimpl.IoServiceImpl;
import com.google.code.arida.common.baseimpl.games.WoW;
import com.google.code.arida.common.baseimpl.svc.AuthenticationServiceImpl;
import com.google.code.arida.i18n.impl.I18nServiceImpl;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

/**
 * The inject module for binding interfaces to implementations.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class AridaInjectModule implements Module {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void configure(final Binder arg0) {
		arg0.bind(AuthenticationService.class).to(
				AuthenticationServiceImpl.class).in(Scopes.SINGLETON);
		arg0.bind(Converter.class).to(ConverterImpl.class);
		arg0.bind(Game.class).annotatedWith(Names.named("WoW")).to(WoW.class);
		arg0.bind(EventTarget.class).to(EventTargetDto.class);
		arg0.bind(I18nService.class).to(I18nServiceImpl.class);
		arg0.bind(IoService.class).to(IoServiceImpl.class);
	}

}
