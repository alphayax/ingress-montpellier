package com.xfaction.ingressmontpellier;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ConnectionActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView iv = (ImageView) findViewById(R.id.imageView_background);
		Drawable d = getResources().getDrawable(R.drawable.yin_yang_ingress);
		d.setAlpha(64);
		iv.setBackground(d);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
