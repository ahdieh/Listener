package com.assignment02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class NameActivity extends Activity {
	@Override
	protected void onCreate(final Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		Intent intent = new Intent();
		intent.putExtra(AppActivity.text, "Greeting from NameActivity");
		setResult(RESULT_OK, intent);
		finish();
	}
}
