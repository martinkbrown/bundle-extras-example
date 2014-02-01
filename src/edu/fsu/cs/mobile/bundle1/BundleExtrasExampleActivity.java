package edu.fsu.cs.mobile.bundle1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BundleExtrasExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /* OnClickListener for the button to start the second Activity without sending any data */
    public void launchSecond(View v)
    {
    	Intent intent = new Intent(this, SecondActivity.class);
    	startActivity(intent);
    }
    /* OnClickListener for the button to start the second Activity and pass data */
    public void sendData(View v)
    {
    	Intent intent = new Intent(this, SecondActivity.class);
    	
    	Bundle bundle = new Bundle();
    	bundle.putString("fname","John");
    	bundle.putString("lname", "Doe");
    	bundle.putInt("default_age", 18);
    	bundle.putInt("gender", 1);
    	intent.putExtras(bundle);
    	startActivity(intent);
    }
}