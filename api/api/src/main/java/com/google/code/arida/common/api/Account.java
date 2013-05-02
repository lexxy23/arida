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
package com.google.code.arida.common.api;

import java.util.List;

import ds2.oss.core.api.CreatedModifiedAware;
import ds2.oss.core.api.Persistable;
import ds2.oss.core.api.StateAware;

/**
 * A user account.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public interface Account
    extends
    Persistable<Long>,
    CreatedModifiedAware,
    StateAware {
    
    /**
     * Returns the openId of this account.
     * 
     * @return the openId of this account
     */
    String getOpenId();
    
    /**
     * A list of characters of this account. This will return any known
     * characters, for every supported game.
     * 
     * @return an empty list, or a list of characters
     */
    List<PlayerCharacter> getChars();
    
    /**
     * Returns the locked state of this account.
     * 
     * @return the locked state of this account
     */
    boolean isLocked();
    
    /**
     * Returns a notification information for the given type.
     * 
     * @param t
     *            the type of the notification
     * @return null, or the notification info. Maybe an email address, an irc
     *         address, a MSISDN etc.
     */
    String getNotificationInfo(NotificationType t);
}
