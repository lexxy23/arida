/**
 * 
 */
package com.google.code.arida.gameconfig.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Locale;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.code.arida.common.api.Game;
import com.google.code.arida.common.api.exceptions.GameInitException;
import com.google.code.arida.gameconfig.api.GameConfigLoaderService;

/**
 * @author kaeto23
 * 
 */
public class ConfigLoaderBeanTest {
	/**
	 * The ejb container.
	 */
	private static EJBContainer ejb;

	/**
	 * Ends the ejb run.
	 */
	@AfterClass
	public static void onEnd() {
		ejb.close();
		ejb = null;
	}

	/**
	 * Methods to perform on starting the test run.
	 */
	@BeforeClass
	public static void onStart() {
		if (ejb == null) {
			ejb = EJBContainer.createEJBContainer();
		}
	}

	/**
	 * The service to test.
	 */
	private GameConfigLoaderService svc;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Context c = ejb.getContext();
		svc = (GameConfigLoaderService) c
				.lookup("java:global/classes/ConfigLoader");
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.gameconfig.impl.ConfigLoaderBean#getGameIds()}
	 * .
	 */
	@Test
	public final void testGetGameIds() {
		assertNotNull(svc);
		List<String> l = null;
		try {
			l = svc.getGameIds();
		} catch (GameInitException e) {
			fail(e.getLocalizedMessage());
		}
		assertNotNull(l);
		assertTrue(l.size() > 0);
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.gameconfig.impl.ConfigLoaderBean#loadGameData(java.lang.String, java.util.Locale)}
	 * .
	 */
	@Test
	public final void testLoadGameData() {
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.gameconfig.impl.ConfigLoaderBean#loadGames(java.util.Locale)}
	 * .
	 */
	@Test
	public final void testLoadGames() {
		assertNotNull(svc);
		try {
			List<Game> germanGames = svc.loadGames(Locale.GERMANY);
			assertNotNull(germanGames);
			assertTrue(germanGames.size() > 0);
		} catch (GameInitException e) {
			fail(e.getLocalizedMessage());
		}
	}

}
