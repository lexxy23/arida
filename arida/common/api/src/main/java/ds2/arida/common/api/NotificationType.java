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
package ds2.arida.common.api;

/**
 * A number of notification types. Usually, these types need an address or
 * something similar to finally work.
 * 
 * @author kaeto23
 * 
 */
public enum NotificationType {
	/**
	 * Internal handling of a notification
	 */
	Internal,
	/**
	 * An email notification
	 */
	Email,
	/**
	 * a SMS notification.
	 */
	SMS,
	/**
	 * a XMPP notification. Jabber, anyone?
	 */
	XMPP,
	/**
	 * a ICQ notification.
	 */
	ICQ,
	/**
	 * a MSN notification
	 */
	MSN,
	/**
	 * an IRC notification
	 */
	IRC,
	/**
	 * a Skype notification.
	 */
	Skype;
}
