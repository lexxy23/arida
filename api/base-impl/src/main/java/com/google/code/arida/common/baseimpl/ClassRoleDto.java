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
package com.google.code.arida.common.baseimpl;

import com.google.code.arida.common.api.ClassRole;

/**
 * A class role dto.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class ClassRoleDto implements ClassRole {

	/**
	 * The svuid.
	 */
	private static final long serialVersionUID = -8677679251914059533L;
	private String description;
	private long id;
	private String title;
	private String shortcode;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public synchronized void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public synchronized void setId(long id) {
		this.id = id;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public synchronized void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getShortcode() {
		return shortcode;
	}

	/**
	 * @param shortcode
	 *            the shortcode to set
	 */
	public synchronized void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

}
