/**
 * 
 */
package ds2.arida.persistence.impl.jpa;

import javax.enterprise.context.ApplicationScoped;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.dto.AccountXml;

import ds2.arida.persistence.api.ConverterSupport;
import ds2.arida.persistence.impl.jpa.entities.AccountEntity;

/**
 * @author dstrauss
 * 
 */
@ApplicationScoped
public class EntityConverter
    implements
    ConverterSupport<Account, AccountEntity> {
    
    /**
     * 
     */
    public EntityConverter() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public Account toDto(final AccountEntity ae) {
        AccountXml rc = new AccountXml();
        rc.setId(ae.getId());
        rc.setCreated(ae.getCreated());
        rc.setEntryState(ae.getEntryState());
        rc.setModified(ae.getModified());
        rc.setOpenId(ae.getOpenId());
        return rc;
    }
    
}
