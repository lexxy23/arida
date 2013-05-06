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
package ds2.arida.persistence.impl.jpa;

import javax.enterprise.context.ApplicationScoped;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.dto.AccountXml;

import ds2.arida.persistence.api.ConverterSupport;
import ds2.arida.persistence.impl.jpa.entities.AccountEntity;

/**
 * Implementation for the entity converter.
 * 
 * @author dstrauss
 * @version 0.1
 */
@ApplicationScoped
public class EntityConverter
    implements
    ConverterSupport<Account, AccountEntity> {
    
    /**
     * Inits the bean.
     */
    public EntityConverter() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public Account toDto(final AccountEntity ae) {
        final AccountXml rc = new AccountXml();
        rc.setId(ae.getId());
        rc.setCreated(ae.getCreated());
        rc.setEntryState(ae.getEntryState());
        rc.setModified(ae.getModified());
        rc.setOpenId(ae.getOpenId());
        return rc;
    }
    
}
