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
 * Created by mariammamo on 5/18/16.
 */
public class recArchive extends Activity {
    String[] rec;
    ListView list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordkarchive);

        Resources res = getResources();
        rec = res.getStringArray(R.array.rec);


        list=(ListView)findViewById(R.id.listView8);
        vizAdapter8 adapter8= new vizAdapter8(this, rec);

        list.setAdapter(adapter8);

    }

    public void matrec(View v)
    {
        if (v.getId() == R.id.recentb) {
            Intent i = new Intent(recArchive.this, recordKeeping.class);
            startActivity(i);
        }
    }

}
class vizAdapter8 extends ArrayAdapter<String> {
    Context context;
    String[] titleArray;

    vizAdapter8(Context c, String[] rec) {
        super(c, R.layout.archrec, R.id.reck1, rec);
        this.context = c;
        this.titleArray = rec;


    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.archrec, parent, false);

        TextView rec = (TextView) row.findViewById(R.id.reck1);
        rec.setText(titleArray[position]);
        return row;

    }
}