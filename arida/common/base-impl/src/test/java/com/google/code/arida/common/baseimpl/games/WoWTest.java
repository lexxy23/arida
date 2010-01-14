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
package com.google.code.arida.common.baseimpl.games;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Locale;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.baseimpl.modules.AridaInjectModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * A test case for testing the impl of WoW.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class WoWTest {
	private WoW wow = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Injector ij = Guice.createInjector(new AridaInjectModule());
		wow = new WoW();
		ij.injectMembers(wow);
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.common.baseimpl.games.WoW#getEventTargets(java.util.Locale)}
	 * .
	 */
	@Test
	public final void testGetGameTargets() {
		Set<EventTarget> targets = wow.getEventTargets(Locale.GERMANY);
		assertNotNull(targets);
		assertTrue(targets.size() > 0);
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.common.baseimpl.games.WoW#getGuildTitle(java.util.Locale)}
	 * .
	 */
	@Test
	public final void testGetGuildTitle() {
		assertEquals("Guild", wow.getGuildTitle(null));
		assertEquals("Guild", wow.getGuildTitle(Locale.ENGLISH));
		assertEquals("Gilde", wow.getGuildTitle(Locale.GERMANY));
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.common.baseimpl.games.WoW#getTitle(java.util.Locale)}
	 * .
	 */
	@Test
	public final void testGetTitle() {
		assertEquals("World of Warcraft", wow.getTitle(null));
		assertEquals("World of Warcraft", wow.getTitle(Locale.ENGLISH));
		assertEquals("World of Warcraft", wow.getTitle(Locale.GERMANY));
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.common.baseimpl.games.WoW#getTypes(java.util.Locale)}
	 * .
	 */
	@Test
	public final void testGetTypes() {
	}

}
