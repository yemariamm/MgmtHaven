package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mariammamo on 2/25/16.
 */
public class ownerorRenter extends Activity{


    protected void onCreate(Bundle savedInstanceState) {
        termsndCon dialog = new termsndCon();
        dialog.show(getFragmentManager(), "termsandCon");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ownerrenter);
    }


    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.ownerB) {
            Intent i = new Intent(ownerorRenter.this, addProp.class);
            startActivity(i);
        }

        if(v.getId()== R.id.renterB){
            Intent i = new Intent(ownerorRenter.this, conectLL.class);
            startActivity(i);
        }
    }
}



