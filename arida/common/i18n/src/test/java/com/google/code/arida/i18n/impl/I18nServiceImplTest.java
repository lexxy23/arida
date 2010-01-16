/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009,2010  Dirk Strauss
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
package com.google.code.arida.i18n.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ResourceBundle;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kaeto23
 * 
 */
public class I18nServiceImplTest {
	private I18nServiceImpl to = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		to = new I18nServiceImpl();
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.i18n.impl.I18nServiceImpl#getResource(java.lang.String, java.util.Locale)}
	 * .
	 */
	@Test
	public final void testGetResource() {
		ResourceBundle rb = to.getResource(null, null);
		assertNull(rb);
		rb = to.getResource("arida", null);
		assertNotNull(rb);
	}

}
