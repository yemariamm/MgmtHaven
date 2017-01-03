package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mariammamo on 5/18/16.
 */
public class llAcctsetting2 extends Activity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.llactsetting2);
    }
    public void linked(View v) {
        if (v.getId() == R.id.linked) {
            Intent i = new Intent(llAcctsetting2.this, tenantsInfo.class);
            startActivity(i);
        }
    }
}
