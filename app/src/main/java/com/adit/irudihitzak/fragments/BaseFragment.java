package com.adit.irudihitzak.fragments;

import android.support.v4.app.Fragment;

import com.adit.irudihitzak.events.EventObserver;
import com.adit.irudihitzak.events.engine.FlipDownCardsEvent;
import com.adit.irudihitzak.events.engine.GameWonEvent;
import com.adit.irudihitzak.events.engine.HidePairCardsEvent;
import com.adit.irudihitzak.events.ui.BackGameEvent;
import com.adit.irudihitzak.events.ui.FlipCardEvent;
import com.adit.irudihitzak.events.ui.NextGameEvent;
import com.adit.irudihitzak.events.ui.ResetBackgroundEvent;
import com.adit.irudihitzak.events.ui.ThemeSelectedEvent;
import com.adit.irudihitzak.events.ui.DifficultySelectedEvent;
import com.adit.irudihitzak.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
