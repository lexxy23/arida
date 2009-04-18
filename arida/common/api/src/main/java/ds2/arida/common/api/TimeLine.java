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
package ds2.arida.common.api;

import java.util.List;

/**
 * A time line of events
 * 
 * @author kaeto23
 * 
 */
public interface TimeLine {
	/**
	 * Returns the type of the logfile
	 * 
	 * @return the type of the logfile
	 */
	public LogType getLogType();

	/**
	 * Returns an ordered list of time line events
	 * 
	 * @return an empty list, or a list of timeline events
	 */
	public List<TimelineEvent> getEvents();
}
