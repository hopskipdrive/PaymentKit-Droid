package com.brendan.pkexample;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import android.view.Window;

/**
 * 
 * @author Brendan Weinstein
 * http://www.brendanweinstein.me
 *
 */
public class PKActivity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(R.id.fragment_holder, new PKFragment(), "CardFragment");
		ft.commit();
	}

}