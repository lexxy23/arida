/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2009-2013  Dirk Strauss
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

/**
 * Some notification event types. Say, events that may be good to inform other
 * people.
 * 
 * @author kaeto23
 * 
 */
public enum NotificationEvents {
	/**
	 * when a new event is created
	 */
	OnEventCreation,
	/**
	 * When an event is cancelled for some reason
	 */
	OnEventCancellation,
	/**
	 * when a raid member changes its state for an event (joining, declining
	 * etc.)
	 */
	OnEventMemberChange,
	/**
	 * when the information of an event is changing. Maybe the map might change,
	 * or the event leader changes etc.
	 */
	OnEventInfoChange;
}
