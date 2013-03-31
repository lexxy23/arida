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

/**
 * The state of an event
 * 
 * @author kaeto23
 * 
 */
public enum EventState {
	/**
	 * The Open state. Meaning that characters are allowed to join an event. Or
	 * changing their state for this event.
	 */
	Open,
	/**
	 * The Closed state. No one, except the officers and the leader, can change
	 * the event. The event may occur NOW.
	 */
	Closed,
	/**
	 * The event state is finished.
	 */
	Finished,
	/**
	 * The event is dropped for some reason
	 */
	Dropped;
}
