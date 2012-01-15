/**
 * 
 */
package com.google.code.arida.gameconfig.api;

import java.util.Locale;

import com.google.code.arida.common.api.Game;
import com.google.code.arida.gameconfig.xjc.GameType;

/**
 * A converter service for the xml to dto conversion.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface XmlDtoConverterService {
	/**
	 * Converts a given xml object into the dto version, using the given locale.
	 * 
	 * @param gt
	 *            the xml object
	 * @param targetLocale
	 *            the target locale to use when generating the dto object
	 * @return a dto object. Or null, if an error occurred.
	 */
	Game convert(GameType gt, Locale targetLocale);
}
