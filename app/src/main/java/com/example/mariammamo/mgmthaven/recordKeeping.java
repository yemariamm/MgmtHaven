package com.example.mariammamo.mgmthaven;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by mariammamo on 3/30/16.
 */
public class recordKeeping extends Activity {
    String [] rec, nums;
    ListView list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordkeeping);

        Resources res = getResources();
        rec = res.getStringArray(R.array.rec);
        nums = res.getStringArray(R.array.nums);

        list=(ListView)findViewById(R.id.listView7);
        vizAdapter7 adapter7= new vizAdapter7(this, rec);

        list.setAdapter(adapter7);

    }


    public void recordk(View v)// for sign in button
    {
        if (v.getId() == R.id.rk2) {
            Intent i = new Intent(recordKeeping.this, recordKeeping2.class);
            startActivity(i);
        }
        if (v.getId() == R.id.archiveb) {
            Intent i = new Intent(recordKeeping.this, recArchive.class);
            startActivity(i);
        }

    }
}
class vizAdapter7 extends ArrayAdapter<String>
{
    Context context;
    String []titleArray;

    vizAdapter7(Context c, String[] rec)
    {
        super(c,R.layout.recordkp,R.id.rec1, rec);
        this.context=c;
        this.titleArray=rec;

    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=  inflater.inflate(R.layout.recordkp,parent,false);

        TextView rec=(TextView)row.findViewById(R.id.rec1);
        //TextView work = (TextView)row.findViewById(R.id.workreq);
        rec.setText(titleArray[position]);
        // work.setText(titleArray[position]);
        return row;
    }
}