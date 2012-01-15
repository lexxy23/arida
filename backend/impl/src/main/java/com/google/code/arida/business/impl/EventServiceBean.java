/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009,2010  Dirk Strauss
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
package com.google.code.arida.business.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import com.google.code.arida.common.api.Event;
import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.api.PlayerCharacter;
import com.google.code.arida.common.api.service.EventService;

/**
 * @author kaeto23
 * 
 */
@Stateless(name = "EventService")
public class EventServiceBean implements EventService {

	/**
	 * 
	 */
	public EventServiceBean() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.code.arida.common.api.service.EventService#createEvent(java
	 * .util.Date, java.util.Date,
	 * com.google.code.arida.common.api.PlayerCharacter,
	 * com.google.code.arida.common.api.EventTarget, java.lang.String)
	 */
	@Override
	public Event createEvent(Date start, Date end, PlayerCharacter leader,
			EventTarget t, String descr) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.code.arida.common.api.service.EventService#deleteEvent(long)
	 */
	@Override
	public boolean deleteEvent(long eventId) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.code.arida.common.api.service.EventService#findByCriteria(
	 * java.util.Date, long)
	 */
	@Override
	public List<Event> findByCriteria(Date startDate, long raidId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.code.arida.common.api.service.EventService#updateEvent(com
	 * .google.code.arida.common.api.Event)
	 */
	@Override
	public boolean updateEvent(Event e) {
		// TODO Auto-generated method stub
		return false;
	}

}
