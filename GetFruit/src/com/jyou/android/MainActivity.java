package com.jyou.android;

import org.apache.cordova.DroidGap;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		setScreen();
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/GetFruit/index.html");
	}
	
	private void setScreen(){
		if (getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		}
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		setScreen();
		super.onResume();
	}

}
