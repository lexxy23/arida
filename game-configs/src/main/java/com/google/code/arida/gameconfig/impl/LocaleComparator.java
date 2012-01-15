/**
 * 
 */
package com.google.code.arida.gameconfig.impl;

import java.util.Comparator;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A comparator to compare different locales.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class LocaleComparator implements Comparator<Locale> {
	/**
	 * A logger.
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(LocaleComparator.class);
	/**
	 * A sequence of characters to fill empty values.
	 */
	private static final String SPACER = "__";

	/**
	 * Inits the comparator.
	 */
	public LocaleComparator() {
		// nothing to do
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compare(final Locale o1, final Locale o2) {
		if (o1 == null && o2 == null) {
			LOG.debug("Both arguments are null");
			return 0;
		}
		if (o1 == null) {
			return 10;
		}
		if (o2 == null) {
			return -10;
		}
		final String s1 = createLocaleStr(o1);
		final String s2 = createLocaleStr(o2);
		return s1.compareTo(s2);
	}

	/**
	 * Creates a symbolic name of the given locale.
	 * 
	 * @param l
	 *            the locale
	 * @return a symbolic name to represent the locale.
	 */
	private String createLocaleStr(final Locale l) {
		final StringBuffer sb = new StringBuffer();
		if (l == null) {
			LOG.warn("No locale given!");
			return "";
		}
		if (l.getLanguage() != null && l.getLanguage().length() > 0) {
			sb.append(l.getLanguage());
		}
		if (l.getCountry() != null && l.getCountry().length() > 0) {
			sb.append(l.getCountry());
		} else {
			sb.append(SPACER);
		}
		if (l.getVariant() != null && l.getVariant().length() > 0) {
			sb.append(l.getVariant());
		} else {
			sb.append(SPACER);
		}
		return sb.toString();
	}

}
