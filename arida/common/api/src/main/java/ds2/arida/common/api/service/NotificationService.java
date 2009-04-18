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

import java.util.Set;

import ds2.arida.common.api.Notification;

/**
 * A notification service to send mails or SMSs from one user to another, or to
 * a group of characters
 * 
 * @author kaeto23
 * 
 */
public interface NotificationService {
	/**
	 * Sends a notification.
	 * 
	 * @param n
	 *            the notification
	 * @return TRUE if sending was successful, otherwise FALSE
	 */
	public boolean sendNotification(Notification n);

	/**
	 * Sends a notification to a number of characters
	 * 
	 * @param n
	 *            a notification to send
	 * @param characters
	 *            a set of characters to receive the notification
	 * @return TRUE if broadcast was successful, otherwise FALSE
	 */
	public boolean broadcastNotification(Notification n, Set<Long> characters);
}
