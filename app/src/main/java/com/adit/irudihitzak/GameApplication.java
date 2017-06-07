package com.adit.irudihitzak;

import android.app.Application;

import com.adit.irudihitzak.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
