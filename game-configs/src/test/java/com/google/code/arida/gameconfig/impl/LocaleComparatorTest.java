/**
 * 
 */
package com.google.code.arida.gameconfig.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kaeto23
 * 
 */
public class LocaleComparatorTest {
	private LocaleComparator to = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		to = new LocaleComparator();
	}

	@Test
	public final void testComp1() {
		assertEquals(-1, to.compare(new Locale("de"), new Locale("en")));
	}

	@Test
	public final void testComp2() {
		assertEquals(-3, to.compare(new Locale("at"), new Locale("de")));
	}

	@Test
	public final void testCountItems1() {
		assertEquals(27, to.compare(new Locale("de"), new Locale("de", "de")));
	}

	@Test
	public final void testCountItems2() {
		assertEquals(-27, to.compare(new Locale("de", "de"), new Locale("de")));
	}

	/**
	 * Test method for
	 * {@link com.google.code.arida.gameconfig.impl.LocaleComparator#compare(java.util.Locale, java.util.Locale)}
	 * .
	 */
	@Test
	public final void testEqualNull() {
		assertEquals(0, to.compare(null, null));
	}

	@Test
	public final void testListSort1() {
		List<Locale> unsortedList = new ArrayList<Locale>();
		unsortedList.add(new Locale("de"));
		unsortedList.add(new Locale("en"));
		unsortedList.add(new Locale("en", "us"));
		Collections.sort(unsortedList, to);
		assertEquals(new Locale("de"), unsortedList.get(0));
		assertEquals(new Locale("en", "us"), unsortedList.get(1));
		assertEquals(new Locale("en"), unsortedList.get(2));
	}

	@Test
	public final void testNull1() {
		assertEquals(-10, to.compare(new Locale("de"), null));
	}

	@Test
	public final void testNull2() {
		assertEquals(10, to.compare(null, new Locale("de")));
	}

}
