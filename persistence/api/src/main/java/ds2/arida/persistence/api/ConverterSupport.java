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

import ds2.oss.core.api.Persistable;

/**
 * Contract for an entity converter.
 * 
 * @author dstrauss
 * @param <E>
 *            The persistable dto type
 * @param <T>
 *            The entity class
 * @version 0.1
 */
public interface ConverterSupport<E extends Persistable<?>, T> {
    /**
     * Converts an entity into a dto.
     * 
     * @param e
     *            the entity
     * @return the dto
     */
    E toDto(T e);
}
