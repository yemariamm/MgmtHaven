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
 * Created by mariammamo on 4/7/16.
 */
public class maintenanceR extends Activity {
    String [] names;
    ListView list;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintenancer);

        Resources res = getResources();
        names = res.getStringArray(R.array.cusnames);


        list=(ListView)findViewById(R.id.listView6);
        vizAdapter6 adapter6= new vizAdapter6(this, names);
        list.setAdapter(adapter6);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent i = new Intent(maintenanceR.this, maintenanceR2.class);
                        startActivity(i);
                        break;
                }

            }

        });

    }

    public void mainreq(View v)// for sign in button
    {

        if (v.getId() == R.id.archiveb) {
            Intent i = new Intent(maintenanceR.this, Archive.class);
            startActivity(i);
        }

    }
    public void matrec(View v)
    {
        if (v.getId() == R.id.main1) {
            Intent i = new Intent(maintenanceR.this, maintenanceR2.class);
            startActivity(i);
        }
    }
}
class vizAdapter6 extends ArrayAdapter<String>
{
    Context context;
    String []titleArray;

    vizAdapter6(Context c, String[] names)
    {
        super(c,R.layout.archlistview,R.id.name1, names);
        this.context=c;
        this.titleArray=names;

    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=  inflater.inflate(R.layout.recentlistview,parent,false);

        TextView name=(TextView)row.findViewById(R.id.name1);
        //TextView work = (TextView)row.findViewById(R.id.workreq);

        name.setText(titleArray[position]);
        // work.setText(titleArray[position]);

        return row;

    }
}