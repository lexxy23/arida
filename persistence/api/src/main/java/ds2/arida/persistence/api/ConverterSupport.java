/**
 * 
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
 * 
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
