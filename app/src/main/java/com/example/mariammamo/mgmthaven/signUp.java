package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mariammamo on 2/21/16.
 */
public class signUp extends Activity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onCreateClick(View v) {
        if (v.getId() == R.id.bcreate) {
            EditText fullname = (EditText) findViewById(R.id.tfname);
            EditText email = (EditText) findViewById(R.id.tfemail);
            EditText pass1 = (EditText) findViewById(R.id.tfpass1);
            EditText pass2 = (EditText) findViewById(R.id.tfpass2);

            String fullnamesrt = fullname.getText().toString();
            String emailstr = email.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str))
            {
                //pop up msg
                Toast pass = Toast.makeText(signUp.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                pass.show();

                Intent i = new Intent(signUp.this, signUp.class);
                startActivity(i);

                // ask user to renter
            }
            else
            {
               // termsndCon dialog = new termsndCon();
                //dialog.show(getFragmentManager(), "termsandCon");

                Intent i = new Intent(signUp.this, ownerorRenter.class);
                startActivity(i);

            }
        }
        if (v.getId() == R.id.signinb2)
        {
            Intent i = new Intent(signUp.this, MainActivity.class);
            startActivity(i);
        }

    }
}


