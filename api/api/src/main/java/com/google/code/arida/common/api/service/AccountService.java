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
package com.google.code.arida.common.api.service;

import java.util.List;
import java.util.Set;

import com.google.code.arida.common.api.Account;
import com.google.code.arida.common.api.PlayerCharacter;

/**
 * Service for managing accounts remotely.
 * 
 * @author Dirk Strauss
 * @version 0.1
 */
public interface AccountService {
    /**
     * Creates an account for the given openId.
     * 
     * @param openId
     *            the openId
     * @return null, or an account
     */
    Account createAccount(String openId);
    
    /**
     * Locks a given account.
     * 
     * @param accId
     *            the account id
     * @return TRUE if the account is locked now, otherwise FALSE
     */
    boolean lockAccount(long accId);
    
    /**
     * Unlocks a locked account.
     * 
     * @param accId
     *            the account id
     * @return TRUE if the account is unlocked now, otherwise FALSE
     */
    boolean unlockAccount(long accId);
    
    /**
     * Returns all characters of the given account.
     * 
     * @param accountId
     *            the id of the account
     * @param gameId
     *            the id of the game
     * @return an empty list, or a list of characters
     */
    List<PlayerCharacter> getAllChars(long accountId, long gameId);
    
    /**
     * Adds a character to the given account.
     * 
     * @param accountId
     *            the account id
     * @param c
     *            the character to create
     * @param gameId
     *            the game id
     * @return TRUE if the character has been created, otherwise FALSE
     */
    boolean addChar(long accountId, PlayerCharacter c, long gameId);
    
    /**
     * Updates a character.
     * 
     * @param c
     *            the character to update
     * @return TRUE if update was successful, otherwise FALSE
     */
    boolean updateChar(PlayerCharacter c);
    
    /**
     * Deletes an account and all of the characters etc. of this account
     * 
     * @param accountId
     *            the account id
     * @return TRUE if the account is deleted successfully, otherwise FALSE
     */
    boolean deleteAccount(long accountId);
    
    /**
     * Returns the account with the given id.
     * 
     * @param id
     *            the id of the account
     * @return null, or the account
     */
    Account getAccountById(long id);
    
    /**
     * Returns the character with the given id.
     * 
     * @param id
     *            the id of the character
     * @return null, or the character
     */
    PlayerCharacter getCharacterById(long id);
    
    /**
     * Returns all characters with the given name.
     * 
     * @param name
     *            a regular expression of the name
     * @return a set of characters, or an empty set
     */
    Set<PlayerCharacter> findCharacterByName(String name);
}
