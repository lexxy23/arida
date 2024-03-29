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
package com.google.code.arida.deployment.localmocks;

import java.net.URL;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;

import com.google.code.arida.common.api.Game;
import com.google.code.arida.common.api.PlayerCharacter;
import com.google.code.arida.common.api.Raid;
import com.google.code.arida.common.api.ValueSystem;
import com.google.code.arida.common.api.service.RaidService;

/**
 * @author dstrauss
 * 
 */
@ApplicationScoped
public class GrRaidServiceImpl implements RaidService {
    
    /**
     * 
     */
    public GrRaidServiceImpl() {
        // TODO Auto-generated constructor stub
    }
    
    /*
     * (non-Javadoc)
     * @see
     * com.google.code.arida.common.api.service.RaidService#getRaidByOrderId
     * (java.lang.String)
     */
    @Override
    public Raid getRaidByOrderId(final String name) {
        Raid r = null;
        if (name.equalsIgnoreCase("gr")) {
            r = new Raid() {
                
                /**
                 * The svuid.
                 */
                private static final long serialVersionUID =
                    -7906179533705832369L;
                
                @Override
                public String getOrderId() {
                    return name;
                }
                
                @Override
                public Long getId() {
                    // TODO Auto-generated method stub
                    return Long.valueOf(0);
                }
                
                @Override
                public String getTitle() {
                    return "Ghoul Runnings";
                }
                
                @Override
                public String getDescr() {
                    return "a test raid";
                }
                
                @Override
                public PlayerCharacter getLeader() {
                    // TODO Auto-generated method stub
                    return null;
                }
                
                @Override
                public Set<PlayerCharacter> getOfficers() {
                    // TODO Auto-generated method stub
                    return null;
                }
                
                @Override
                public Set<PlayerCharacter> getMembers() {
                    // TODO Auto-generated method stub
                    return null;
                }
                
                @Override
                public ValueSystem getInitialValueType() {
                    // TODO Auto-generated method stub
                    return null;
                }
                
                @Override
                public URL getForumUrl() {
                    // TODO Auto-generated method stub
                    return null;
                }
                
                @Override
                public Game getGame() {
                    // TODO Auto-generated method stub
                    return null;
                }
                
                @Override
                public String getTagName() {
                    return "GR";
                }
            };
        }
        return r;
    }
    
}
