package com.assignment02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AppActivity extends Activity {

	public static final int REQUEST_CODE = 100;
	public static final String text = "text";

	private Button textButton;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.appactivity);

		final String textValue;

		if (savedInstanceState != null){
			textValue = savedInstanceState.getString(text, "");
		}
		else{
			textValue = "Open NameActivity";
		}

		final Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View view) {
				Intent intent = new Intent(AppActivity.this, NameActivity.class);
				startActivityForResult(intent, REQUEST_CODE);
			}

		});

		textButton = (Button) findViewById(R.id.button);
		textButton.setText(textValue);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent intent){

		if(requestCode == REQUEST_CODE){
			if (resultCode == RESULT_OK){
				String value = intent.getStringExtra(text);
				textButton.setText(value);
			}
		}
	}

	@Override
	protected void onStart(){
		super.onStart();
	}

	@Override
	protected void onResume(){
		super.onResume();
	}

	@Override
	protected void onPause(){
		super.onPause();
	}

	@Override
	protected void onSaveInstanceState(final Bundle outState){
		super.onSaveInstanceState(outState);
		outState.putString(text, "Save Instance state called");
	}

	@Override
	protected void onStop(){
		super.onStop();
	}

	@Override
	protected void onDestroy(){
		super.onDestroy();
	}
}
