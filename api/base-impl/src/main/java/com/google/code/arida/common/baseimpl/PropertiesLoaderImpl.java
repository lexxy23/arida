/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009-2011  Dirk Strauss
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
package com.google.code.arida.common.baseimpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.code.arida.common.api.internal.IoService;
import com.google.code.arida.common.api.service.PropertiesLoaderService;

/**
 * The base implementation for the properties loader.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
@Singleton
public class PropertiesLoaderImpl implements PropertiesLoaderService {
    /**
     * A logger.
     */
    private static final Logger LOG = LoggerFactory
        .getLogger(PropertiesLoaderImpl.class);
    /**
     * The io service.
     */
    @Inject
    private IoService io;
    
    /**
     * Creates in instance of the bean.
     */
    public PropertiesLoaderImpl() {
        // nothing to do
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Properties loadProperties(final String path) {
        final Properties rc = new Properties();
        final InputStream is = getClass().getResourceAsStream(path);
        if (is != null) {
            try {
                rc.load(is);
            } catch (final IOException e) {
                LOG.warn("Error when loading the properties file " + path, e);
            } finally {
                io.close(is);
            }
        }
        return rc;
    }
    
}
