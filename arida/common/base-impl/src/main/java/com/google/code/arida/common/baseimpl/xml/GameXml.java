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
package com.google.code.arida.common.baseimpl.xml;

import java.util.Locale;
import java.util.Set;

import javax.xml.bind.annotation.XmlType;

import com.google.code.arida.common.api.CharacterType;
import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.api.Game;


/**
 * transfer object for a Game
 * 
 * @author kaeto23
 * 
 */
@XmlType(name = "Game", namespace = "http://www.ds2/ns/arida")
public class GameXml implements Game {

	/**
	 * 
	 */
	public GameXml() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<EventTarget> getGameTargets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGuildTitle(Locale l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getShortCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<CharacterType> getTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
