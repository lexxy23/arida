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
package com.google.code.arida.common.api.service;

import com.google.code.arida.common.api.LogType;
import com.google.code.arida.common.api.TimeLine;

/**
 * This service interprets a given event log and creates appropriate entries in
 * the database.
 * 
 * @author kaeto23
 * 
 */
public interface LogParserService {
	/**
	 * Interpretes a given event and creates some entries for the database
	 * 
	 * @param eventLog
	 *            the eventLog. This string can be anything considered a log
	 *            file.
	 * @param test
	 *            test flag to indicate that no real db entry should be made
	 */
	public void interpreteEvent(String eventLog, boolean test);

	/**
	 * Parses a log file string and creates a timeline of events
	 * 
	 * @param eventLog
	 *            the log file string
	 * @param l
	 *            the log type
	 * @return null, or a timeline with a list of events
	 */
	public TimeLine parseLog(String eventLog, LogType l);
}
