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
/**
 * 
 */
package ds2.arida.common.api.service;

import ds2.arida.common.api.Account;

/**
 * Service for generating cookies or checking the validness of a cookie value
 * 
 * @author kaeto23
 * 
 */
public interface AuthenticationService {
	/**
	 * Creates a cookie value for the given account
	 * 
	 * @param a
	 *            the account to create a cookie value for
	 * @return a cookie value to authenticate this account
	 */
	public String createCookieValue(Account a);

	/**
	 * Returns the account of the given cookie value
	 * 
	 * @param id
	 *            the cookie value
	 * @return null, or an account this value belongs to
	 */
	public Account getAccountFromCookie(String id);

	/**
	 * Deletes the cookie value (aka logout)
	 * 
	 * @param s
	 *            the cookie value
	 * @return TRUE if delete was successful, otherwise FALSE
	 */
	public boolean deleteValue(String s);
}
