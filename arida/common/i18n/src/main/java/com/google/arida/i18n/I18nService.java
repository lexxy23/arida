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
package com.google.arida.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * A service for translations.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface I18nService {
	/**
	 * Returns a resource for the requested locale.
	 * 
	 * @param fileBaseName
	 *            the base name of the property file.
	 * 
	 * @param l
	 *            the locale to use
	 * @return a resource bundle to use
	 */
	ResourceBundle getResource(String fileBaseName, Locale l);

	/**
	 * Loads the translation of the given key from the given basename using the
	 * given locale.
	 * 
	 * @param titleKey
	 *            the property name
	 * @param fileBaseName
	 *            the file base name
	 * @param l
	 *            the locale to use
	 * @return an empty string, or the translated property
	 */
	String getTranslation(String titleKey, String fileBaseName, Locale l);

	/**
	 * Loads the translation of the given key from the given basename using the
	 * given locale.
	 * 
	 * @param titleKey
	 *            the property name
	 * @param fileBaseName
	 *            the file base name
	 * @param l
	 *            the locale to use
	 * @param defValue
	 *            a default value in case of a missing resource.
	 * @return an empty string, or the translated property
	 */
	String getTranslation(String titleKey, String fileBaseName, Locale l,
			String defValue);
}
