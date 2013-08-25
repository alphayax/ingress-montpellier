package com.xfaction.ingressmontpellier;

import com.xfaction.ingressmontpellier.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        if( isLargeScreen(this))
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        else
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public static boolean isLargeScreen(Context context) {
    	return (context.getResources().getConfiguration().screenLayout
    	& Configuration.SCREENLAYOUT_SIZE_MASK)
    	>= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
