/**
 * 
 */
package com.google.code.arida.gameconfig.impl;

import java.util.Comparator;
import java.util.Locale;

import com.google.code.arida.gameconfig.xjc.I18NType;

/**
 * A comparator for the i18n xml type.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public final class I18nComparator implements Comparator<I18NType> {
	/**
	 * Inits the comparator.
	 */
	public I18nComparator() {
		// nothing to do
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compare(final I18NType o1, final I18NType o2) {
		if (o1 == null) {
			return 10;
		}
		if (o2 == null) {
			return -10;
		}
		final Locale l1 = getLocale(o1);
		final Locale l2 = getLocale(o2);
		return new LocaleComparator().compare(l1, l2);
	}

	/**
	 * Creates a locale from the given i18n type.
	 * 
	 * @param t
	 *            the i18n type
	 * @return the locale
	 */
	private Locale getLocale(final I18NType t) {
		Locale rc = null;
		rc = new Locale(t.getLanguage());
		if (t.getCountryCode() != null) {
			rc = new Locale(t.getLanguage(), t.getCountryCode());
			if (t.getI18NVariant() != null) {
				rc = new Locale(t.getLanguage(), t.getCountryCode(), t
						.getI18NVariant());
			}
		}
		return rc;
	}
}
