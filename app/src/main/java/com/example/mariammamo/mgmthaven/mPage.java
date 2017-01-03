package com.example.mariammamo.mgmthaven;


import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 * Created by mariammamo on 2/20/16.
 */
public class mPage extends Activity {
    String[] titles;
    int[] images = {R.drawable.emailenvelope, R.drawable.wrench, R.drawable.money, R.drawable.file};
    ListView list;

    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;
    double num1,num2,sum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mpage);

        Resources res = getResources();
        titles = res.getStringArray(R.array.ltitles);

        list = (ListView) findViewById(R.id.listView);
        vizAdapter adapter = new vizAdapter(this, titles, images);
        list.setAdapter(adapter);

        firstNumber = (EditText)findViewById(R.id.proincome);
        secondNumber = (EditText)findViewById(R.id.expense);
        addResult = (TextView)findViewById(R.id.profit);
        btnAdd = (Button)findViewById(R.id.profbutton);

        btnAdd.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sum = num1 - num2;

                NumberFormat nf = NumberFormat.getInstance();
                DecimalFormat df = (DecimalFormat) nf;
                df.applyPattern("#,###.00");
                addResult.setText("$" +df.format(sum));


            }
        });

        /*
         addResult.setText(Double.toString(sum));
  		        tv.setText("Result:"+df.format(result));*/

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ){
                switch (position)
                {
                    case 1: Intent i = new Intent(mPage.this, maintenanceR.class);
                        startActivity(i);
                        break;

                    case 3: Intent j = new Intent(mPage.this, recordKeeping.class);
                        startActivity(j);
                        break;
                }

            }

        });

    }

    public void llsetting(View v)  // for sign in button
    {
        if (v.getId() == R.id.lset) {
            Intent i = new Intent(mPage.this, LaccountSetting.class);
            startActivity(i);
        }
    }
}

class vizAdapter extends ArrayAdapter<String>
{
    Context context;
    int [] images;
    String [] titleArray;

    vizAdapter(Context c, String[] titles, int imgs[])
        {
            super(c, R.layout.singlerow, R.id.item_title, titles); // calling adapter here
            this.context=c;
            this.images=imgs;
            this.titleArray= titles;
        }

    public View getView(int position, View convertView, ViewGroup parent){ //called for every row

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.singlerow,parent,false); //row object ref to layout

        ImageView myImage= (ImageView) row.findViewById(R.id.item_icon);
        TextView myTitle =(TextView) row.findViewById(R.id.item_title);

        myImage.setImageResource(images[position]);
        myTitle.setText(titleArray[position]);


        return row;
    }
}






