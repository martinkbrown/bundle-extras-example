package edu.fsu.cs.mobile.bundle1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SecondActivity extends Activity {

	TextView fullnameText;
	EditText age;
	RadioGroup radio;
	RadioButton rButton;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.second);
	    
	    fullnameText = (TextView) findViewById(R.id.userName);
	    age = (EditText) findViewById(R.id.age);
	    radio = (RadioGroup) findViewById(R.id.radioGroup1);
	    
	    Intent intent = getIntent();
	    
	    Bundle bundle = intent.getExtras();
		  
	    if(bundle != null)
	    {
		    fullnameText.setText(bundle.getString("fname") + " " + bundle.getString("lname"));
		    age.setText("" + bundle.getInt("default_age"));
		    int genderSelection = bundle.getInt("gender");
		    rButton = ((RadioButton) radio.getChildAt(genderSelection));
		    rButton.setChecked(true);
	    }
	    
	}

}
