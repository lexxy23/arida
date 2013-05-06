package ds2.arida.persistence.impl.jpa.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.NotificationType;
import com.google.code.arida.common.api.PlayerCharacter;

import ds2.oss.core.api.EntryStates;
import ds2.oss.core.base.impl.CreatedModifiedAwareModule;
import ds2.oss.core.base.impl.StateAwareModule;

/**
 * Entity implementation class for Entity: Account.
 * 
 * @author dstrauss
 * @version 0.1
 */
@Entity
@Table(name = "AR_ACCOUNT")
public class AccountEntity implements Account {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The id of the entry.
     */
    @Id
    private long id;
    
    /**
     * The state module.
     */
    @Embedded
    private final StateAwareModule state;
    /**
     * The date module.
     */
    @Embedded
    private final CreatedModifiedAwareModule date;
    /**
     * The open id.
     */
    @Column(name = "openid")
    private String openId;
    
    public AccountEntity() {
        super();
        state = new StateAwareModule();
        date = new CreatedModifiedAwareModule();
    }
    
    public AccountEntity(final Account e) {
        this();
        state.setEntryState(e.getEntryState());
        openId = e.getOpenId();
    }
    
    @Override
    public Long getId() {
        return id;
    }
    
    public void setId(final long id) {
        this.id = id;
    }
    
    @Override
    public EntryStates getEntryState() {
        return state.getEntryState();
    }
    
    @Override
    public Date getCreated() {
        return date.getCreated();
    }
    
    @Override
    public Date getModified() {
        return date.getModified();
    }
    
    @Override
    public String getOpenId() {
        return openId;
    }
    
    @Override
    public List<PlayerCharacter> getChars() {
        return null;
    }
    
    @Override
    public boolean isLocked() {
        return EntryStates.LOCKED.equals(getEntryState());
    }
    
    @Override
    public String getNotificationInfo(final NotificationType t) {
        return null;
    }
    
}
