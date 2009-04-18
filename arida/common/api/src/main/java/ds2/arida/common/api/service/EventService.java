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
package ds2.arida.common.api.service;

import java.util.Date;
import java.util.List;

import ds2.arida.common.api.Character;
import ds2.arida.common.api.Event;
import ds2.arida.common.api.EventTarget;

/**
 * Service for managing raid events
 * 
 * @author kaeto23
 * 
 */
public interface EventService {
	/**
	 * Creates an event
	 * 
	 * @param start
	 *            the start date
	 * @param end
	 *            the end date
	 * @param leader
	 *            the raid leader
	 * @param t
	 *            the event target
	 * @param descr
	 *            a possible description
	 * @return the event, or null in case of an error
	 */
	public Event createEvent(Date start, Date end, Character leader,
			EventTarget t, String descr);

	/**
	 * Updates a given event
	 * 
	 * @param e
	 *            the event to update
	 * @return TRUE if update was successful, otherwise FALSE
	 */
	public boolean updateEvent(Event e);

	/**
	 * Deletes the event with the given event id
	 * 
	 * @param eventId
	 *            the event id
	 * @return TRUE if deletion was successful, otherwise FALSE
	 */
	public boolean deleteEvent(long eventId);

	/**
	 * Finds an event based on the given criteria
	 * 
	 * @param startDate
	 *            the possible start date
	 * @param raidId
	 *            the id of the raid. Must be set.
	 * @return an empty list, or a list of possible raid events. Usually, the
	 *         count of this list may not exceed a constant count.
	 */
	public List<Event> findByCriteria(Date startDate, long raidId);
}
