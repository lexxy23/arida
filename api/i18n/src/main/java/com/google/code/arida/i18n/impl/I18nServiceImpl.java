/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2009-2013  Dirk Strauss
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

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import com.google.arida.i18n.I18nService;

/**
 * The implementation for the i18n service.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class I18nServiceImpl implements I18nService {
	/**
	 * The base package name where to search for any i18n files.
	 */
	private static final String BASEPACKAGE = "com.google.code.arida.i18n.";
	/**
	 * A logger.
	 */
	private static final Logger log = Logger.getLogger(I18nServiceImpl.class
			.getName());

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceBundle getResource(final String fileBaseName, final Locale l) {
		if (fileBaseName == null || fileBaseName.length() <= 0) {
			return null;
		}
		Locale.setDefault(Locale.US);
		ResourceBundle rc = null;
		// check if file exists
		/*
		 * String rbStr = "/" + BASEPACKAGE.replaceAll("\\.", "/"); rbStr +=
		 * fileBaseName + ".properties"; log.finer("rb is " + rbStr); final
		 * InputStream is = getClass().getResourceAsStream(rbStr); if (is ==
		 * null) { log.warning("Cannot find " + rbStr + "!"); return null; } try
		 * { is.close(); } catch (IOException e) { e.printStackTrace(); }
		 */
		if (l == null) {
			rc = ResourceBundle.getBundle(BASEPACKAGE + fileBaseName);
		} else {
			rc = ResourceBundle.getBundle(BASEPACKAGE + fileBaseName, l);
		}
		return rc;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTranslation(final String titleKey,
			final String fileBaseName, final Locale l) {
		return getTranslation(titleKey, fileBaseName, l, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTranslation(final String titleKey,
			final String fileBaseName, final Locale l, final String defValue) {
		ResourceBundle rb = getResource(fileBaseName, l);
		if (rb == null) {
			log.warning("No resource bundle found for base " + fileBaseName
					+ ", locale " + l + ".");
			return defValue;
		}
		String rc = defValue;
		try {
			rc = rb.getString(titleKey);
		} catch (MissingResourceException e) {
			log.warning("Error when getting a translation: "
					+ e.getLocalizedMessage());
			log.throwing(I18nServiceImpl.class.getName(), "getTranslation", e);
		}
		return rc;
	}
}
