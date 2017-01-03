package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
// take out extention to ActionBarActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onButtonClick (View v)// for sign in button
    {
        if (v.getId() == R.id.bSignin)
        {
            Intent i = new Intent(MainActivity.this, mPage.class);
            startActivity(i);
        }
        if (v.getId() == R.id.bSignup) // for cretae button
        {
            Intent i = new Intent(MainActivity.this, signUp.class);
            startActivity(i);
        }

    }
public void resetmethod(View v)
{
    fpwDialog dialog = new fpwDialog();
    dialog.show(getFragmentManager(), "fpwDialog");
}

public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
