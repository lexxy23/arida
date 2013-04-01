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

import ds2.oss.core.api.Persistable;

/**
 * A player character. This is a character that is played by a player (so, no
 * NPC).
 * 
 * @author dstrauss
 * @version 0.1
 */
public interface PlayerCharacter extends Persistable<Long> {
    /**
     * Returns the name of the character.
     * 
     * @return the name of the character
     */
    String getCharName();
    
    /**
     * Returns the types of this character.
     * 
     * @return the list of character types this char has
     */
    List<CharacterType> getTypes();
    
    /**
     * Returns the guild or clan of this character.
     * 
     * @return the guild or clan of this character, or null
     */
    Guild getGuild();
    
    /**
     * Flag to indicate that this character is hibernated and should not be
     * displayed in any queries.
     * 
     * @return TRUE if this character is hibernated, otherwise FALSE
     */
    boolean isHibernated();
    
    /**
     * Returns the deletion flag.
     * 
     * @return TRUE if this character is deleted, otherwise FALSE
     */
    boolean isDeleted();
    
    /**
     * If the current character has been renamed, this method will return the
     * new character.
     * 
     * @return null, or the new character
     */
    PlayerCharacter getRenamedCharacter();
}
