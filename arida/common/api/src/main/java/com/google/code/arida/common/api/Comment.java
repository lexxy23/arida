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

import java.util.Date;
import java.util.Locale;

/**
 * A comment to an event or member
 * 
 * @author kaeto23
 * 
 */
public interface Comment {
	/**
	 * Returns the id of the entry
	 * 
	 * @return the id of the entry
	 */
	public long getId();

	/**
	 * Returns the author of the comment
	 * 
	 * @return the author of the comment
	 */
	public Character getAuthor();

	/**
	 * Returns the created date
	 * 
	 * @return the created date
	 */
	public Date getCreated();

	/**
	 * Returns a possible update date
	 * 
	 * @return null, or the update date
	 */
	public Date getUpdated();

	/**
	 * Returns the type of the comment
	 * 
	 * @return the type of the comment
	 */
	public CommentContentType getContentType();

	/**
	 * Returns the language of the comment.
	 * 
	 * @return the language of the comment
	 */
	public Locale getCommentLanguage();
}
