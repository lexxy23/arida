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
package com.google.code.arida.common.api;

import java.util.List;

/**
 * A user account
 * 
 * @author kaeto23
 * 
 */
public interface Account {
	/**
	 * the ID of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the openId of this account
	 * 
	 * @return the openId of this account
	 */
	public String getOpenId();

	/**
	 * A list of characters of this account
	 * 
	 * @return an empty list, or a list of characters
	 */
	public List<Character> getChars();

	/**
	 * Returns the locked state of this account
	 * 
	 * @return the locked state of this account
	 */
	public boolean isLocked();

	/**
	 * Returns a notification information for the given type
	 * 
	 * @param t
	 *            the type of the notification
	 * @return null, or the notification info. Maybe an email address, an irc
	 *         address, a MSISDN etc.
	 */
	public String getNotificationInfo(NotificationType t);
}
