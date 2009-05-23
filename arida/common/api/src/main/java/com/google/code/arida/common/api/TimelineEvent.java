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
package com.google.code.arida.common.api;

import java.util.Date;
import java.util.Set;

/**
 * A timeline event
 * 
 * @author kaeto23
 * 
 */
public interface TimelineEvent {
	/**
	 * Returns the time of this event
	 * 
	 * @return the time of this event
	 */
	public Date getEventTime();

	/**
	 * Returns all characters who participated on this event
	 * 
	 * @return a set of characters, or an empty set
	 */
	public Set<Character> getAffectedCharacters();

	/**
	 * Returns a possible set of items being dropped in case of a boss fight, or
	 * map win.
	 * 
	 * @return an empty set, or a set of items
	 */
	public Set<Item> getLoot();

	/**
	 * Returns the type of the timeline event
	 * 
	 * @return the type of the timeline event
	 */
	public TimelineEventType getEventType();
}
