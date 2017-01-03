package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by mariammamo on 3/9/16.
 */
// Renter's homepage
public class renterHp extends Activity {
    String[] titles;
    int[] images = {R.drawable.emailenvelope, R.drawable.wrench, R.drawable.money};
    ListView list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.renterhp);

        Resources res = getResources();
        titles = res.getStringArray(R.array.rtitles);

        list = (ListView) findViewById(R.id.listView1);
        vizAdapter2 adapter2 = new vizAdapter2(this, titles, images);
        list.setAdapter(adapter2);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent i = new Intent(renterHp.this, maintenanceR2.class);
                        startActivity(i);
                        break;
                }

            }

        });


    }
    // for sign in button
    public void rpsetting(View v)
    {
        if (v.getId() == R.id.settings) {
            Intent i = new Intent(renterHp.this, LaccountSetting.class);
            startActivity(i);
        }
    }
}
class vizAdapter2 extends ArrayAdapter<String>
{
    Context context;
    int [] images;
    String [] titleArray;

    vizAdapter2(Context c, String[] titles, int imgs[])
    {
        super(c,R.layout.singlerow,R.id.item_title,titles);
        this.context =c;
        this.images=imgs;
        this.titleArray=titles;
    }

    public View getView(int position, View convertView, ViewGroup parent){


        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.singlerow,parent,false); //row object ref to layout

        ImageView myImage= (ImageView) row.findViewById(R.id.item_icon);
        TextView myTitle =(TextView) row.findViewById(R.id.item_title);

        myImage.setImageResource(images[position]);
        myTitle.setText(titleArray[position]);





        return row;
    }
}
