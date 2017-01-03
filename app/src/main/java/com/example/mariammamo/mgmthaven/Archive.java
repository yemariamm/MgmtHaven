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
 * Created by mariammamo on 4/20/16.
 */

public class Archive extends Activity {
    String [] names;
    ListView list;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marchive);


        Resources res = getResources();
        names = res.getStringArray(R.array.cusnames);


        list=(ListView)findViewById(R.id.listView5);
        vizAdapter5 adapter5= new vizAdapter5(this, names);
        list.setAdapter(adapter5);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent i = new Intent(Archive.this, maintenanceR2.class);
                        startActivity(i);
                        break;
                }

            }

        });


    }


    public void matrec(View v)
    {
        if (v.getId() == R.id.main2) {
            Intent i = new Intent(Archive.this, maintenanceR2.class);
            startActivity(i);
        }

        if (v.getId() == R.id.recentb) {
            Intent i = new Intent(Archive.this, maintenanceR.class);
            startActivity(i);
        }
    }
}
class vizAdapter5 extends ArrayAdapter<String>
{
    Context context;
    String []titleArray;

    vizAdapter5(Context c, String[] names)
    {
        super(c,R.layout.archlistview,R.id.name1, names);
        this.context=c;
        this.titleArray=names;


    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=  inflater.inflate(R.layout.archlistview,parent,false);

        TextView name=(TextView)row.findViewById(R.id.name1);
        //TextView work = (TextView)row.findViewById(R.id.workreq);


        name.setText(titleArray[position]);
       // work.setText(titleArray[position]);



        return row;

    }
}