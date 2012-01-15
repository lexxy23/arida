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
/**
 * 
 */
package com.google.code.arida.common.api;

/**
 * The type of a log file string.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public enum LogType {
	/**
	 * EQDKP 1.5 Logfile type. This is usually a XML file containing wipes,
	 * loot, players etc. Produced by the WoW Addon RaidTracker.
	 */
	EQDKP1_5,
	/**
	 * The log format for Runes of Magic
	 */
	RoM_RAIDLOGGER;
}