package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mariammamo on 3/14/16.
 */
public class incomingRev  extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incomingrevenue);
    }

    public void incomerb(View v)
    {
        if (v.getId()== R.id.incomeb)
        {
            Intent i= new Intent(incomingRev.this, mPage.class);
            startActivity(i);
        }
        if (v.getId()==R.id.incomeb2)
        {
            Intent i= new Intent(incomingRev.this, mPage.class);
            startActivity(i);
        }
    }
}

