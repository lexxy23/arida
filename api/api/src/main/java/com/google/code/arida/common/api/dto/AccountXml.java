/**
 * 
 */
package com.google.code.arida.common.api.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.NotificationType;
import com.google.code.arida.common.api.PlayerCharacter;

import ds2.oss.core.api.EntryStates;

/**
 * Implementation of the account dto.
 * 
 * @author dstrauss
 * @version 0.1
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "account")
@XmlType(name = "AccountType")
public class AccountXml implements Account {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -190584278065522886L;
    /**
     * The id of the entry.
     */
    @XmlAttribute
    private Long id;
    /**
     * The creation date.
     */
    @XmlElement
    private Date created;
    /**
     * The modification date.
     */
    @XmlElement
    private Date modified;
    /**
     * The state.
     */
    @XmlElement
    private EntryStates entryState;
    /**
     * The open id.
     */
    @XmlElement
    private String openId;
    
    /**
     * @param id
     *            the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }
    
    /**
     * @param created
     *            the created to set
     */
    public void setCreated(final Date created) {
        this.created = created;
    }
    
    /**
     * @param modified
     *            the modified to set
     */
    public void setModified(final Date modified) {
        this.modified = modified;
    }
    
    /**
     * @param entryState
     *            the entryState to set
     */
    public void setEntryState(final EntryStates entryState) {
        this.entryState = entryState;
    }
    
    /**
     * @param openId
     *            the openId to set
     */
    public void setOpenId(final String openId) {
        this.openId = openId;
    }
    
    /**
     * Inits the dto.
     */
    public AccountXml() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public Long getId() {
        return id;
    }
    
    @Override
    public Date getCreated() {
        return created;
    }
    
    @Override
    public Date getModified() {
        return modified;
    }
    
    @Override
    public EntryStates getEntryState() {
        return entryState;
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
        return EntryStates.LOCKED.equals(entryState);
    }
    
    @Override
    public String getNotificationInfo(final NotificationType t) {
        return null;
    }
    
}
