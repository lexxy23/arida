/**
 * 
 */
package ds2.arida.persistence.api;

import com.google.code.arida.common.api.exceptions.AridaException;

import ds2.oss.core.api.Persistable;

/**
 * @author dstrauss
 * @param <E>
 *            The DTO type
 * @param <T>
 *            the type of the persistence primary key
 * 
 */
public interface PersistenceSupport<E extends Persistable<T>, T> {
    E create(E e) throws AridaException;
    
    E getById(T t) throws AridaException;
}
