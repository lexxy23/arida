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
package com.google.code.arida.common.baseimpl.games;

import java.util.HashSet;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

import com.google.code.arida.common.api.CharacterType;
import com.google.code.arida.common.api.ClassRole;
import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.api.service.Converter;
import com.google.code.arida.common.baseimpl.CharacterTypeDto;
import com.google.code.arida.common.baseimpl.ClassRoleDto;
import com.google.code.arida.common.baseimpl.EventTargetDto;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * The property implementation for the mmorpg world of warcraft.
 * 
 * @author Dirk Strauss
 * @version 1.0
 */
@Singleton
public class WoW extends AbstractGame {
	/**
	 * A list of event targets.
	 */
	private Set<EventTarget> targets;
	/**
	 * A list of character types.
	 */
	private Set<CharacterType> types;
	/**
	 * The resource file to load for any WoW related information.
	 */
	private static final String MAINRESOURCE = "/com/google/code/arida/common/baseimpl/game-wow-keys.properties";
	/**
	 * A number converter.
	 */
	@Inject
	private Converter conv;

	/**
	 * Initialises the game support for World of Warcraft.
	 */
	public WoW() {
		super("wow", MAINRESOURCE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<EventTarget> getEventTargets(Locale l) {
		String targetsStr = props.getProperty("game.targets");
		Set<EventTarget> rc = new HashSet<EventTarget>();
		if (targetsStr == null || targetsStr.length() <= 0) {
			LOG.info("Nothing found in properties!");
			return rc;
		}
		String[] targetIds = targetsStr.split(",");
		for (String targetId : targetIds) {
			StringBuffer baseKey = new StringBuffer("game.targets.")
					.append(targetId);
			String titleKey = baseKey.toString() + ".title";
			EventTargetDto dto = new EventTargetDto();
			dto.setTitle(i18n.getTranslation(titleKey, "wow", l));
			dto.setDescr(i18n.getTranslation(baseKey.toString() + ".descr",
					"wow", l));
			dto.setShortCode(targetId);
			dto.setMinLevel(conv.toInt(props.getProperty(baseKey.toString()
					+ ".minlevel"), 0));
			rc.add(dto);
		}
		targets = rc;
		return targets;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getGuildTitle(Locale l) {
		if (l == null) {
			l = Locale.ENGLISH;
		}
		ResourceBundle rb = i18n.getResource("wow", l);
		return rb.getString("game.guildTitle");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getId() {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTitle(Locale l) {
		if (l == null) {
			l = Locale.GERMAN;
		}
		ResourceBundle rb = i18n.getResource("wow", l);
		return rb.getString("game.title");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<CharacterType> getTypes(Locale l) {
		String charTypesStr = props.getProperty("game.chartypes");
		if (charTypesStr == null || charTypesStr.length() <= 0) {
			return types;
		}
		String[] charTypeIds = charTypesStr.split(",");
		ResourceBundle rb = i18n.getResource("wow", l);
		for (String charTypeId : charTypeIds) {
			String baseKey = "game.types." + charTypeId + ".";
			CharacterTypeDto type = new CharacterTypeDto();
			type.setGame(this);
			type.setTitle(rb.getString(baseKey + "title"));
			type.setDescription(rb.getString(baseKey) + "descr");
			String rolesStr = rb.getString(baseKey) + "roles";
			String[] roles = rolesStr.split(",");
			for (String role : roles) {
				type.addClassRole(findRoleByCode(role));
			}
			types.add(type);
		}
		return types;
	}

	private Set<ClassRole> loadRoles(Locale l) {
		Set<ClassRole> roles = new HashSet<ClassRole>();
		String rolesStr = props.getProperty("game.charroles");
		ResourceBundle rb = i18n.getResource("wow", l);
		String[] roleIds = rolesStr.split(",");
		String baseKey = "game.role.";
		for (String roleId : roleIds) {
			ClassRoleDto r = new ClassRoleDto();
			r.setDescription(rb.getString(baseKey + roleId + ".descr"));
			r.setTitle(rb.getString(baseKey + roleId + ".title"));
			r.setShortcode(roleId);
			roles.add(r);
		}
		return roles;
	}

	private ClassRole findRoleByCode(String s) {
		return null;
	}

}
