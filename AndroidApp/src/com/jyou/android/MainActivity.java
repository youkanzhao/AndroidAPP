package com.jyou.android;

import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class MainActivity extends DroidGap {

	@Override  
    public void onCreate(Bundle savedInstanceState)  
    {  
        super.onCreate(savedInstanceState);  
        // Set by <content src="index.html" /> in config.xml  
//        super.loadUrl(Config.getStartUrl());  
        super.loadUrl("file:///android_asset/www/getFruit/index.html");
//        super.loadUrl("http://www.baidu.com");
    }

}
