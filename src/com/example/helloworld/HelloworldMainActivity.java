package com.example.helloworld;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

////实现一：
//public class HelloworldMainActivity extends Activity {
//	private static final String TAG = "TestEvent1";
//	public HelloworldMainActivity() {
//	}
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.helloworld_main);
//
//		final TextView Text = (TextView) findViewById(R.id.text1);
//		final Button Button1 = (Button) findViewById(R.id.btn1);
//		final Button Button2 = (Button) findViewById(R.id.btn2);
//
//		Button1.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Text.setBackgroundColor(Color.RED);
//			}
//		}
//		);
//		Button2.setOnClickListener(new OnClickListener() {
//
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Text.setBackgroundColor(Color.GREEN);
//			}
//		});
//
//	}
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.helloworld_main, menu);
//		return true;
//	}
//}

public class HelloworldMainActivity extends Activity implements OnClickListener {
	private final static String TAG = "TestEvent2";
	private TextView myText;
	private Button Button1;
	private Button Button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helloworld_main);
		TextView myText = (TextView) findViewById(R.id.text1);
		Button1 = (Button) findViewById(R.id.btn1);
		Button1.setOnClickListener(this);// 设置监听的类
		Button2 = (Button) findViewById(R.id.btn2);
		Button2.setOnClickListener(this);// 设置监听的类

	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		Log.v(TAG, "onclick()");
		switch (view.getId()) {
		case R.id.btn1:
			//System.out.println("1233333");
			myText.setBackgroundColor(Color.RED);
			break;
		case R.id.btn2:
			myText.setBackgroundColor(Color.GREEN);
			break;
		default:
			Log.v(TAG,"other");
			break;
		}
	}
}
