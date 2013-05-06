/**
 * 
 */
package ds2.arida.persistence.impl.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.exceptions.AridaException;

import ds2.arida.persistence.api.PersistenceSupport;
import ds2.arida.persistence.impl.jpa.entities.AccountEntity;
import ds2.oss.core.interceptors.LogCallings;

/**
 * The JPA implementation for accessing accounts.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Stateless
@LogCallings
public class AccountBean implements PersistenceSupport<Account, Long> {
    /**
     * The entity manager.
     */
    @PersistenceContext(unitName = "aridaPU")
    private EntityManager em;
    /**
     * An entity converter.
     */
    @Inject
    private EntityConverter conv;
    
    /**
     * INits the bean.
     */
    public AccountBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public Account create(final Account e) throws AridaException {
        final AccountEntity ae = new AccountEntity(e);
        em.persist(ae);
        return conv.toDto(ae);
    }
    
    @Override
    public Account getById(final Long t) throws AridaException {
        return conv.toDto(em.find(AccountEntity.class, t));
    }
    
}
