package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by mariammamo on 4/19/16.
 */
public class RaccountSettings extends Activity {
    String[] titles;
    ListView list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raccsettings);

        Resources res = getResources();
        titles = res.getStringArray(R.array.rvac);

        list = (ListView) findViewById(R.id.listView4);
        vizAdapter4 adapter4 = new vizAdapter4(this, titles);
        list.setAdapter(adapter4);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent i = new Intent(RaccountSettings.this, maintenanceR2.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent j = new Intent(RaccountSettings.this, renterHp.class);
                        startActivity(j);
                        break;
                }

            }

        });


    }


    public void acctsettb(View v)// for sign in button
    {
        if (v.getId() == R.id.lset) {
            Intent i = new Intent(RaccountSettings.this, renterHp.class);
            startActivity(i);
        }
    }
}
class vizAdapter4 extends ArrayAdapter<String>
{
    Context context;
    String [] titleArray;

    vizAdapter4(Context c, String[] titles)
    {
        super(c,R.layout.reglistview,R.id.acc_titles,titles);
        this.context =c;
        this.titleArray=titles;
    }

    public View getView(int position, View convertView, ViewGroup parent){


        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.reglistview,parent,false); //row object ref to layout

        TextView myTitle =(TextView) row.findViewById(R.id.acc_titles);

        myTitle.setText(titleArray[position]);

        return row;
    }
}
