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
package ds2.arida.persistence.api;

import com.google.code.arida.common.api.exceptions.AridaException;

import ds2.oss.core.api.Persistable;

/**
 * Contract for persistence support.
 * 
 * @author dstrauss
 * @param <E>
 *            The DTO type
 * @param <T>
 *            the type of the persistence primary key
 * @version 0.1
 */
public interface PersistenceSupport<E extends Persistable<T>, T> {
    /**
     * Creates the entity.
     * 
     * @param e
     *            the dto to persist
     * @return the created dto
     * @throws AridaException
     *             if an error occurred
     */
    E create(E e) throws AridaException;
    
    /**
     * Returns the entity with the given id.
     * 
     * @param t
     *            the primary key value
     * @return the found entity dto
     * @throws AridaException
     *             if an error occurred
     */
    E getById(T t) throws AridaException;
}
