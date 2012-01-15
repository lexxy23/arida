/**
 * 
 */
package com.google.code.arida.gameconfig.impl;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.code.arida.common.api.CharacterType;
import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.api.Game;
import com.google.code.arida.gameconfig.api.XmlDtoConverterService;
import com.google.code.arida.gameconfig.impl.dto.GameDto;
import com.google.code.arida.gameconfig.xjc.EventTargetType;
import com.google.code.arida.gameconfig.xjc.GameType;
import com.google.code.arida.gameconfig.xjc.I18NType;

/**
 * The implementation for converting xml objects into dto objects.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
@Stateless
public class XmlConverterBean implements XmlDtoConverterService {
	/**
	 * A logger.
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(XmlConverterBean.class);

	/**
	 * Inits the bean.
	 */
	public XmlConverterBean() {
		// nothing to do
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Game convert(final GameType gt, final Locale targetLocale) {
		if (gt == null) {
			LOG.warn("No xml object given! Returning null.");
			return null;
		}
		if (targetLocale == null) {
			LOG.warn("No locale given! Returning null.");
			return null;
		}
		final GameDto rc = new GameDto();
		rc.setEventTargets(convert(gt.getEvents()));
		rc.setGuildTitle(convertI18n(gt.getGuildTitle(), targetLocale));
		rc.setId(0);
		rc.setShortCode(gt.getId());
		rc.setTitle(convertI18n(gt.getName(), targetLocale));
		rc.setTypes(convert(gt.getCharacterType(), targetLocale));
		return rc;
	}

	/**
	 * Converts a list of xml character types into the dto version.
	 * 
	 * @param characterType
	 *            the list of xml character types
	 * @param targetLocale
	 *            the target locale to use.
	 * @return a set of character types, or null if no types could be found
	 */
	private Set<CharacterType> convert(
			final List<com.google.code.arida.gameconfig.xjc.CharacterType> characterType,
			final Locale targetLocale) {
		return null;
	}

	/**
	 * Converts a set of xml event target types into their dto version.
	 * 
	 * @param events
	 *            a list of xml event targets.
	 * @return a list of dto event targets
	 */
	private Set<EventTarget> convert(final List<EventTargetType> events) {
		return null;
	}

	/**
	 * Returns the text data from a given set of text data of the specified
	 * locale.
	 * 
	 * @param texts
	 *            the list of text data
	 * @param targetLocale
	 *            the target locale
	 * @return the text data of the given target locale, or the english version,
	 *         or an empty string if nothing was found.
	 */
	protected String convertI18n(final List<I18NType> texts,
			final Locale targetLocale) {
		String rc = "";
		if (targetLocale == null) {
			LOG.warn("No locale given!");
			return rc;
		}
		if (texts == null || texts.size() <= 0) {
			LOG.warn("No texts given to convert!");
			return rc;
		}
		Collections.sort(texts, new I18nComparator());
		for (I18NType textType : texts) {
			final String lang = textType.getLanguage();
			if (targetLocale.getLanguage().equalsIgnoreCase(lang)) {
				rc = textType.getValue();
			}
		}
		return rc;
	}
}
