package com.adit.irudihitzak.events.ui;

import com.adit.irudihitzak.events.AbstractEvent;
import com.adit.irudihitzak.events.EventObserver;
import com.adit.irudihitzak.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
