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

/**
 * The events for giving value points on.
 * 
 * @author kaeto23
 * 
 */
public enum ValueSystemEvent {
	/**
	 * On regular intervals. You need to tell what an interval is
	 */
	OnRegularInterval,
	/**
	 * The initial number for new raid members
	 */
	InitialPoints,
	/**
	 * The amount of value points when a raid member is invited early
	 */
	OnEarlyInvite,
	/**
	 * when the event officially starts
	 */
	OnEventStart,
	/**
	 * when the event officially ends (i.e. map win)
	 */
	OnEventEnd,
	/**
	 * when a raid boss is killed successfully
	 */
	OnBossKill,
	/**
	 * when the raid first kills a boss
	 */
	OnRaidFirstBossKill,
	/**
	 * On fragging an enemy (PVP)
	 */
	OnEnemyFrag,
	/**
	 * Points on defusing the bomb (PVP)
	 */
	OnDefusing,
	/**
	 * On returning the flag to the base (PVP)
	 */
	OnReturningFlag;

}
