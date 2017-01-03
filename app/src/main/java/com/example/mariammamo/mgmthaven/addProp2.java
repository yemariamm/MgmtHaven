package com.example.mariammamo.mgmthaven;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;


/**
 * Created by mariammamo on 2/22/16.
 */
public class addProp2 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addaproperty2);
    }
    public void onsubmit(View v)
    {
        if (v.getId()== R.id.addprop2)
        {
            Intent i= new Intent(addProp2.this, incomingRev.class);
            startActivity(i);
        }
        if (v.getId()== R.id.skipb)
        {
            Intent i= new Intent(addProp2.this, incomingRev.class);
            startActivity(i);
        }

    }
}
