/**
 * Arida Raid and Clan Management Copyright (C) 2009-2011 Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.google.code.arida.frontend.webapp.mocks;

import java.util.List;

import javax.ejb.Stateless;

import com.google.code.arida.common.api.Guild;
import com.google.code.arida.common.api.GuildMember;
import com.google.code.arida.common.api.service.GuildService;

/**
 * @author Kaeto23
 *
 */
@Stateless
public class GuildServiceMock implements GuildService {

  /**
   *
   */
  public GuildServiceMock() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc) @see
   * com.google.code.arida.common.api.service.GuildService#getGuildByTag(java
   * .lang.String)
   */
  @Override
  public Guild getGuildByTag(String tag) {
    Guild rc = null;
    if (tag.equalsIgnoreCase("gbb")) {
      rc = new Guild() {

        /**
         * The svuid.
         */
        private static final long serialVersionUID =
            5819441919176198914L;

        @Override
        public String getTagName() {
          return "GBB";
        }

        @Override
        public long getId() {
          return 1;
        }

        @Override
        public String getClanTag() {
          return getTagName();
        }

        @Override
        public String getTitle() {
          return "Gummibaerchenbande";
        }

        @Override
        public List<GuildMember> getMembers() {
          // TODO Auto-generated method stub
          return null;
        }

        @Override
        public long getGameId() {
          // TODO Auto-generated method stub
          return 0;
        }
      };
    }
    return rc;
  }
}
