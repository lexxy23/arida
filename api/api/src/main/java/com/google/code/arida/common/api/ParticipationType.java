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

import ds2.oss.core.api.NumericEnumValue;

/**
 * The type of participation for an event.
 * 
 * @author dstrauss
 * @version 0.1
 */
public enum ParticipationType implements NumericEnumValue {
    /**
     * The raid character is accepted to participate.
     */
    Accepted,
    /**
     * The raid character is not actively participating but shows interest.
     */
    OnHold,
    /**
     * The raid character wants to participate.
     */
    WantsToJoin,
    /**
     * The raid character does not want to join (for some reason).
     */
    NoParticipation,
    /**
     * The raid character is not interested on such events and therefore drops
     * participation. This state may be permanent for the given raid target
     */
    NotInterested;
    
    @Override
    public int getNumericalValue() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
