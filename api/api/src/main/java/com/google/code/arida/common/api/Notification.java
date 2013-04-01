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
 * A notification.
 * 
 * @author kaeto23
 * 
 */
public interface Notification extends Comment {
	/**
	 * Returns the receiver of the notification.
	 * 
	 * @return the receiver of the notification
	 */
	public PlayerCharacter getReceiver();

	/**
	 * Returns the type of the notification.
	 * 
	 * @return the type of the notification
	 */
	public NotificationType getNotificationType();

	/**
	 * Returns the title of the notification.
	 * 
	 * @return a possible title of the notification
	 */
	public String getTitle();
}
