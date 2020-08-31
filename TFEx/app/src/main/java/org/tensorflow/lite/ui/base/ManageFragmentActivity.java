package org.tensorflow.lite.ui.base;
import android.os.Bundle;

import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.lite.utils.ScreenManager;


public class ManageFragmentActivity extends AppCompatActivity {
	private final String TAG = this.getClass().getSimpleName();

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		ScreenManager.getScreenManager().popActivity(this);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ScreenManager.getScreenManager().pushActivity(this);
		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	protected void initView() {

	}
}
