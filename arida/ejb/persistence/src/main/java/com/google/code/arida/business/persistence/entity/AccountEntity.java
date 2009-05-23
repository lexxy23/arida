/**
 * Arida Raid and Clan Management
 * Copyright (C) 2009  Dirk Strauss
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
package com.google.code.arida.business.persistence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.PlayerCharacter;
import com.google.code.arida.common.api.NotificationType;


/**
 * The accounts
 * 
 * @author kaeto23
 * 
 */
@Entity(name = "Account")
@Table(name = "arida_accounts")
public class AccountEntity implements Account {

	/**
	 * 
	 */
	public AccountEntity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<PlayerCharacter> getChars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNotificationInfo(NotificationType t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOpenId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return false;
	}

}
