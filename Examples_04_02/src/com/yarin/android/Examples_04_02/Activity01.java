package com.yarin.android.Examples_04_02;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Activity01 extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button button = (Button) findViewById(R.id.button1);
		/* 监听button的事件信息; Tom Xue: Anonymous Inner Classes */
		button.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,
						KeyEvent.KEYCODE_BACK));
				Activity01.this.finish();
			}
		});
	}
}
