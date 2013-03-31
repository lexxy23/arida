/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2013  Dirk Strauss
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

/**
 * A member of an event
 * 
 * @author kaeto23
 * 
 */
public interface Participation extends Serializable {
	/**
	 * Returns the date the member decided to participate
	 * 
	 * @return the created date
	 */
	public Date getCreated();

	/**
	 * Returns the date the member changed the state of the participation
	 * 
	 * @return null, or the date
	 */
	public Date getUpdated();

	/**
	 * Returns the character of the event.
	 * 
	 * @return the character of this event
	 */
	public PlayerCharacter getCharacter();

	/**
	 * Returns the possible role of this event.
	 * 
	 * @return the possible role of this event, or null if not chosen
	 */
	public ClassRole getRole();

	/**
	 * Returns the participation type of the member
	 * 
	 * @return the participation type
	 */
	public ParticipationType getParticipationType();

	/**
	 * Returns a note of the member
	 * 
	 * @return null, or a note of the member
	 */
	public String getNote();
}
