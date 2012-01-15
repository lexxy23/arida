/**
 * 
 */
package com.google.code.arida.gameconfig.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.code.arida.common.api.Game;
import com.google.code.arida.common.api.exceptions.GameInitException;
import com.google.code.arida.common.api.internal.IoService;
import com.google.code.arida.common.api.service.PropertiesLoaderService;
import com.google.code.arida.common.baseimpl.IoServiceImpl;
import com.google.code.arida.common.baseimpl.modules.AridaInjectModule;
import com.google.code.arida.gameconfig.api.GameConfigLoaderService;
import com.google.code.arida.gameconfig.api.XmlDtoConverterService;
import com.google.code.arida.gameconfig.xjc.GameType;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The base implementation for the loader service.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
@Stateless(name = "ConfigLoader")
@Singleton
public class ConfigLoaderBean implements GameConfigLoaderService {
	/**
	 * A logger.
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(ConfigLoaderBean.class);
	/**
	 * The converter service.
	 */
	@EJB
	private XmlDtoConverterService conv;
	/**
	 * The propertiesloader service.
	 */
	@Inject
	private PropertiesLoaderService propsSvc;
	/**
	 * The io service.
	 */
	@Inject
	private IoService iosvc;
	/**
	 * The xml context.
	 */
	private JAXBContext xmlCtx;

	/**
	 * Inits the bean.
	 * 
	 * @throws JAXBException
	 *             if the xml config could not be loaded successfully.
	 */
	public ConfigLoaderBean() throws JAXBException {
		xmlCtx = JAXBContext
				.newInstance("com.google.code.arida.gameconfig.xjc");
	}

	/**
	 * Executed after CDI.
	 */
	@PostConstruct
	public void afterInit() {
		LOG.info("Creating injection using Guice.");
		final Injector ij = Guice.createInjector(new AridaInjectModule());
		propsSvc = ij.getInstance(PropertiesLoaderService.class);
		iosvc = ij.getInstance(IoServiceImpl.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<String> getGameIds() throws GameInitException {
		final Properties props = propsSvc
				.loadProperties("/arida/config/games.properties");
		final List<String> rc = new ArrayList<String>();
		final String propsVal = props.getProperty("arida.games", "");
		final Scanner sc = new Scanner(propsVal);
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			String gameId = sc.next();
			if (gameId == null) {
				continue;
			}
			gameId = gameId.trim();
			if (gameId.length() <= 0) {
				continue;
			}
			rc.add(gameId);
		}
		return rc;
	}

	/**
	 * Creates an unmarshaller for reading the xml configs.
	 * 
	 * @return an unmarshaller
	 * @throws GameInitException
	 *             if an error occurred.
	 */
	private Unmarshaller getUnmarshaller() throws GameInitException {
		Unmarshaller rc = null;
		try {
			rc = xmlCtx.createUnmarshaller();
		} catch (final JAXBException e) {
			throw new GameInitException("Could not setup the XML reader!", e);
		}
		return rc;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Game loadGameData(final String id, final Locale l)
			throws GameInitException {
		final String xmlPath = "/arida/config/" + id + ".xml";
		final InputStream is = getClass().getResourceAsStream(xmlPath);
		final Unmarshaller um = getUnmarshaller();
		Game rc = null;
		try {
			final GameType gameType = (GameType) um.unmarshal(is);
			rc = conv.convert(gameType, l);
		} catch (final JAXBException e) {
			throw new GameInitException("Error when loading path " + xmlPath
					+ "!", e);
		} finally {
			iosvc.close(is);
		}
		return rc;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Game> loadGames(final Locale l) throws GameInitException {
		final List<String> gameIds = getGameIds();
		final List<Game> rc = new ArrayList<Game>();
		for (String gameId : gameIds) {
			final Game game = loadGameData(gameId, l);
			rc.add(game);
		}
		return rc;
	}

}
