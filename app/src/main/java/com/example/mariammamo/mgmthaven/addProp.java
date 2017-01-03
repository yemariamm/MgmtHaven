package com.example.mariammamo.mgmthaven;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;

/**
 * Created by mariammamo on 2/22/16.
 */
public class addProp extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addproperty);
    }
// second page to add property
    public void onaddpropone(View v)
    {
        if (v.getId()== R.id.addprop1)
        {
            Intent i= new Intent(addProp.this, addProp2.class);
            startActivity(i);
        }
    }

}







