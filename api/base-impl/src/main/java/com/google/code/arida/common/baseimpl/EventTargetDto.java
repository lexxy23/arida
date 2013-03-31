/*
 * Arida - A guild and raid management portal
 * Copyright (C) 2013  Dirk Strauss
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

import com.google.code.arida.common.api.EventTarget;

/**
 * A base implementation for an event target.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
public class EventTargetDto implements EventTarget {
    
    /**
     * The svuid.
     */
    private static final long serialVersionUID = 5235115044859803346L;
    private String descr;
    private long id;
    private int minLevel;
    private String shortCode;
    private String title;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescr() {
        return descr;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getId() {
        return id;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int getMinLevel() {
        return minLevel;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getShortCode() {
        return shortCode;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getTitle() {
        return title;
    }
    
    /**
     * @param descr
     *            the descr to set
     */
    public synchronized void setDescr(final String descr) {
        this.descr = descr;
    }
    
    /**
     * @param id
     *            the id to set
     */
    public synchronized void setId(final long id) {
        this.id = id;
    }
    
    /**
     * @param minLevel
     *            the minLevel to set
     */
    public synchronized void setMinLevel(final int minLevel) {
        this.minLevel = minLevel;
    }
    
    /**
     * @param shortCode
     *            the shortCode to set
     */
    public synchronized void setShortCode(final String shortCode) {
        this.shortCode = shortCode;
    }
    
    /**
     * @param title
     *            the title to set
     */
    public synchronized void setTitle(final String title) {
        this.title = title;
    }
    
}
