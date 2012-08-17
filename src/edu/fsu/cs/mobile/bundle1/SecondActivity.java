package edu.fsu.cs.mobile.bundle1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondActivity extends Activity {

	EditText edit1;
	EditText edit2;
	RadioGroup radio;
	RadioButton rButton;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.second);
	    
	    edit1 = (EditText) findViewById(R.id.editText1);
	    edit2 = (EditText) findViewById(R.id.editText2);
	    radio = (RadioGroup) findViewById(R.id.radioGroup1);
	    
	    Intent intent = getIntent();
	    
	    Bundle bundle = intent.getExtras();
		  
	    if(bundle != null)
	    {
		    edit1.setText(bundle.getString("fname"));
		    edit2.setText(bundle.getString("lname"));
		    int genderSelection = bundle.getInt("gender");
		    rButton = ((RadioButton) radio.getChildAt(genderSelection));
		    rButton.setChecked(true);
	    }
	    
	}

}
