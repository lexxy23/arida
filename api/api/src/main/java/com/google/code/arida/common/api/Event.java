/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009-2011  Dirk Strauss
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
package com.google.code.arida.common.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * A simple raid event.
 * 
 * @author kaeto23
 * 
 */
public interface Event extends Serializable {
	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * returns the start date of the event
	 * 
	 * @return the start date of the event
	 */
	public Date getStartDate();

	/**
	 * Returns the invite date
	 * 
	 * @return the invite date, or null if not applicable
	 */
	public Date getInviteDate();

	/**
	 * Returns the possible end date of the event
	 * 
	 * @return the end date, or null if open end
	 */
	public Date getEndDate();

	/**
	 * Returns the leader of this event
	 * 
	 * @return the leader of this event
	 */
	public PlayerCharacter getLeader();

	/**
	 * Returns the event template to use
	 * 
	 * @return the event template
	 */
	public EventTemplate getTemplate();

	/**
	 * Returns a possible description for this event.
	 * 
	 * @return null, or a description
	 */
	public String getDescr();

	/**
	 * Returns all members of the raid event.
	 * 
	 * @return all event members
	 */
	public Set<Participation> getMembers();

	/**
	 * Returns a list of comments for this event
	 * 
	 * @return a list of comments, or null if no comment is available
	 */
	public List<Comment> getComments();

	/**
	 * Returns the event state of the event
	 * 
	 * @return the event state
	 */
	public EventState getState();

	/**
	 * Returns the number of DKP, EP or whatever on participation.
	 * 
	 * @return the amount of DKP/EP/... on participation
	 */
	public float getHonorPoints();

	/**
	 * Returns the count of allowed roles for this event. This is a narrowing of
	 * the event template
	 * 
	 * @param r
	 *            the role
	 * @return the allowed count. Any positive integer means the count, a 0
	 *         indicates a forbidden role, and a negative number means no limit
	 */
	public int getCountOfRole(ClassRole r);

	/**
	 * Returns the minimum level for a player character to join.
	 * 
	 * @return the minimum level, or -1 if not applicable or not necessary
	 */
	public int getMinLevel();

	/**
	 * Returns the maximum level for a player character to join.
	 * 
	 * @return the maximum level, or -1 if not applicable or not necessary
	 */
	public int getMaxLevel();

}
