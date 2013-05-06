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

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.exceptions.AridaException;

import ds2.arida.persistence.api.AccountPersistence;
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
public class AccountBean implements AccountPersistence {
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
