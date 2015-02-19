package com.exaple.linkinglogin;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void ButtonClicked(View v){

		EditText ed_name=(EditText)findViewById(R.id.editText1);
		String name=ed_name.getText().toString();

		EditText ed_email=(EditText)findViewById(R.id.editText2);
		String email=ed_email.getText().toString();

		EditText ed_pass=(EditText)findViewById(R.id.editText3);
		String pass=ed_pass.getText().toString();

		EditText ed_conpass=(EditText)findViewById(R.id.editText4);
		String conpass=ed_conpass.getText().toString();

		EditText ed_phone=(EditText)findViewById(R.id.editText5);
		String phone=ed_phone.getText().toString();

		String username="sajna";
		String emailid="s@gmail.com";
		String password="sa";
		String confirmpass="sa";
		String phoneno="9746727830";

		if(username.equals(name)&&(emailid.equals(email)&&(password.equals(pass)&&(confirmpass.equals(conpass)&&(phoneno.equals(phone)))))){
			Toast.makeText(getApplicationContext(), "Login successfully", Toast.LENGTH_LONG).show();	
		}
		else
		{
			Toast.makeText(getApplicationContext(), "User doesn't exist", Toast.LENGTH_LONG).show();

		}


		if(name.equals("")){
			ed_name.setError("Enter name");
			return;
		}
		
	}
}
