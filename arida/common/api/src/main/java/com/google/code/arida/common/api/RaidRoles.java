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

/**
 * The role types of order members
 * 
 * @author kaeto23
 * 
 */
public enum RaidRoles {
	/**
	 * The leader of the order
	 */
	Leader,
	/**
	 * The member is an officer. Supporting the leader
	 */
	Officer,
	/**
	 * The typical member of an order
	 */
	Member,
	/**
	 * This role applies on any new members
	 */
	Guest,
	/**
	 * An inactive order role means that the associated account may be dropping
	 * interest in the order
	 */
	InActive,
	/**
	 * The account is offline. The raid member should be not mentioned in any
	 * tables or statistics.
	 */
	Offline;
}
