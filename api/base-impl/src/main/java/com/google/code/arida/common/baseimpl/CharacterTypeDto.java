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
package com.google.code.arida.common.baseimpl;

import java.util.HashSet;
import java.util.Set;

import com.google.code.arida.common.api.CharacterType;
import com.google.code.arida.common.api.ClassRole;
import com.google.code.arida.common.api.Game;

/**
 * A character type dto.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class CharacterTypeDto implements CharacterType {
    /**
     * The svuid.
     */
    private static final long serialVersionUID = -3124430708178337797L;
    /**
     * The allowed roles.
     */
    private final Set<ClassRole> allowedRoles;
    /**
     * The game.
     */
    private Game game;
    /**
     * The internal id.
     */
    private Long id;
    /**
     * The title.
     */
    private String title;
    /**
     * The description.
     */
    private String description;
    
    public CharacterTypeDto() {
        allowedRoles = new HashSet<ClassRole>();
    }
    
    public void addClassRole(final ClassRole r) {
        allowedRoles.add(r);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Set<ClassRole> getAllowedRoles() {
        return allowedRoles;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Game getGame() {
        return game;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Long getId() {
        return id;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the game.
     * 
     * @param game
     *            the game to set
     */
    public synchronized void setGame(final Game game) {
        this.game = game;
    }
    
    /**
     * Sets the id.
     * 
     * @param id
     *            the id to set
     */
    public synchronized void setId(final Long id) {
        this.id = id;
    }
    
    /**
     * Sets the title.
     * 
     * @param title
     *            the title to set
     */
    public synchronized void setTitle(final String title) {
        this.title = title;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the description.
     * 
     * @param description
     *            the description to set
     */
    public synchronized void setDescription(final String description) {
        this.description = description;
    }
    
}
