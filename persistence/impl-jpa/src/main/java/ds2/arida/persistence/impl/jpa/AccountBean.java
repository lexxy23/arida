/**
 * 
 */
package ds2.arida.persistence.impl.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.exceptions.AridaException;

import ds2.arida.persistence.api.PersistenceSupport;
import ds2.arida.persistence.impl.jpa.entities.AccountEntity;
import ds2.oss.core.interceptors.LogCallings;

/**
 * @author dstrauss
 * 
 */
@Stateless
@LogCallings
public class AccountBean implements PersistenceSupport<Account, Long> {
    private static final Logger LOG = LoggerFactory
        .getLogger(AccountBean.class);
    @PersistenceContext(unitName = "aridaPU")
    private EntityManager em;
    @Inject
    private EntityConverter conv;
    
    /**
     * 
     */
    public AccountBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public Account create(final Account e) throws AridaException {
        AccountEntity ae = new AccountEntity(e);
        em.persist(ae);
        return conv.toDto(ae);
    }
    
    @Override
    public Account getById(final Long t) throws AridaException {
        return null;
    }
    
}
