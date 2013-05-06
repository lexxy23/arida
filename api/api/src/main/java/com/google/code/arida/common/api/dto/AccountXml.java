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
     * Sets the id.
     * 
     * @param id
     *            the id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }
    
    /**
     * Sets the creation date.
     * 
     * @param created
     *            the created to set
     */
    public void setCreated(final Date created) {
        this.created = created;
    }
    
    /**
     * Sets the modification date.
     * 
     * @param modified
     *            the modified to set
     */
    public void setModified(final Date modified) {
        this.modified = modified;
    }
    
    /**
     * Sets the state.
     * 
     * @param entryState
     *            the entryState to set
     */
    public void setEntryState(final EntryStates entryState) {
        this.entryState = entryState;
    }
    
    /**
     * Sets the open id.
     * 
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
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((id == null) ? 0 : id.hashCode());
        result = (prime * result) + ((openId == null) ? 0 : openId.hashCode());
        return result;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof AccountXml)) {
            return false;
        }
        AccountXml other = (AccountXml) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (openId == null) {
            if (other.openId != null) {
                return false;
            }
        } else if (!openId.equals(other.openId)) {
            return false;
        }
        return true;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AccountXml [id=");
        builder.append(id);
        builder.append(", created=");
        builder.append(created);
        builder.append(", modified=");
        builder.append(modified);
        builder.append(", entryState=");
        builder.append(entryState);
        builder.append(", openId=");
        builder.append(openId);
        builder.append("]");
        return builder.toString();
    }
    
}
