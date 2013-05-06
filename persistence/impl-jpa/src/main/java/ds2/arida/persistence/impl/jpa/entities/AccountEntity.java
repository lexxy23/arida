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
package ds2.arida.persistence.impl.jpa.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
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
    
    /**
     * Inits the entity.
     */
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
