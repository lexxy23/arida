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

import java.util.regex.Pattern;

import com.google.code.arida.common.api.Raid;
import com.google.code.arida.common.api.RaidMember;
import com.google.code.arida.common.api.RaidRoles;

/**
 * Service for managing a raid.
 * 
 * @author Dirk Strauss
 * @version 0.1
 */
public interface RaidAdminService extends RaidService {
    /**
     * A pattern for guild tags.
     */
    Pattern GUILDTAGPATTERN = Pattern.compile("[A-Z][A-Z1-9]+");
    
    /**
     * Adds the given character to the raid.
     * 
     * @param raidId
     *            the id of the raid
     * 
     * @param c
     *            the character to add
     * @param role
     *            the role of the character
     * @return the created raid member, or null
     */
    RaidMember addMember(long raidId, long c, RaidRoles role);
    
    /**
     * Removes a member from the raid.
     * 
     * @param raidId
     *            the id of the raid
     * @param characterId
     *            the id of the character
     * @return TRUE of dropping was successful, otherwise FALSE
     */
    boolean dropMember(long raidId, long characterId);
    
    /**
     * Updates the member role of a given member.
     * 
     * @param raidId
     *            the id of the raid
     * @param charId
     *            the id of the character
     * @param r
     *            the new role of this character
     * @return TRUE if update was successful, otherwise FALSE
     */
    boolean updateMemberRole(long raidId, long charId, RaidRoles r);
    
    /**
     * Hibernates the given character.
     * 
     * @param raidMemberId
     *            the character to hibernate
     */
    void hibernateMember(long raidMemberId);
    
    /**
     * Creates a raid.
     * 
     * @param characterId
     *            the id of the leader of the raid
     * @param title
     *            the title of the raid
     * @return null, or the created raid
     */
    Raid createRaid(long characterId, String title);
    
    /**
     * Updates the given raid.
     * 
     * @param r
     *            the raid to update
     * @return TRUE if update was successful, otherwise FALSE
     */
    boolean updateRaid(Raid r);
    
    /**
     * Deletes the given raid.
     * 
     * @param raidId
     *            the id of the raid
     * @return TRUE if delete was successful, otherwise FALSE
     */
    boolean deleteRaid(long raidId);
}
