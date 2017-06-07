package com.adit.irudihitzak.events;

import com.adit.irudihitzak.events.engine.FlipDownCardsEvent;
import com.adit.irudihitzak.events.engine.GameWonEvent;
import com.adit.irudihitzak.events.engine.HidePairCardsEvent;
import com.adit.irudihitzak.events.ui.BackGameEvent;
import com.adit.irudihitzak.events.ui.DifficultySelectedEvent;
import com.adit.irudihitzak.events.ui.FlipCardEvent;
import com.adit.irudihitzak.events.ui.NextGameEvent;
import com.adit.irudihitzak.events.ui.ResetBackgroundEvent;
import com.adit.irudihitzak.events.ui.StartEvent;
import com.adit.irudihitzak.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
