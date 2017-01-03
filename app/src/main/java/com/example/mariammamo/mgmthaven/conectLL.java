package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mariammamo on 3/14/16.
 */
public class conectLL extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connectll);
    }
    public void cllsubmit (View v)
    {
        if (v.getId() == R.id.cll)
        {
            Intent i = new Intent(conectLL.this, renterHp.class);
            startActivity(i);
        }
    }

}
