/**
 * 
 */
package com.google.code.arida.gameconfig.impl.dto;

import java.util.Set;

import com.google.code.arida.common.api.CharacterType;
import com.google.code.arida.common.api.EventTarget;
import com.google.code.arida.common.api.Game;

/**
 * @author kaeto23
 * 
 */
public class GameDto implements Game {

	/**
	 * The svuid.
	 */
	private static final long serialVersionUID = 617331609085310101L;
	private Set<EventTarget> eventTargets;
	private String guildTitle;
	private long id;
	private String shortCode;
	private String title;
	private Set<CharacterType> types;

	/**
	 * 
	 */
	public GameDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<EventTarget> getEventTargets() {
		return eventTargets;
	}

	@Override
	public String getGuildTitle() {
		return guildTitle;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getShortCode() {
		return shortCode;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Set<CharacterType> getTypes() {
		return types;
	}

	/**
	 * @param eventTargets
	 *            the eventTargets to set
	 */
	public synchronized void setEventTargets(final Set<EventTarget> eventTargets) {
		this.eventTargets = eventTargets;
	}

	/**
	 * @param guildTitle
	 *            the guildTitle to set
	 */
	public synchronized void setGuildTitle(final String guildTitle) {
		this.guildTitle = guildTitle;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public synchronized void setId(final long id) {
		this.id = id;
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

	/**
	 * @param types
	 *            the types to set
	 */
	public synchronized void setTypes(final Set<CharacterType> types) {
		this.types = types;
	}

}
