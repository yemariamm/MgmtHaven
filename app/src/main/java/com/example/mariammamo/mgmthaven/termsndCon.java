package com.example.mariammamo.mgmthaven;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by mariammamo on 3/1/16.
 */
public class termsndCon extends DialogFragment {
    LayoutInflater inflater;
    View v;

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.termsndcond, null);

        Button agreed = (Button) v.findViewById(R.id.agreed);
        Button exit2 = (Button) v.findViewById(R.id.exit2);

        //final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //builder.setView(v);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v);
        agreed.setOnClickListener(new View.OnClickListener() {
            // agreed.setOnClickListener( new DialogInterface.OnClickListener() {

            public void onClick(View v) {


                Toast.makeText(getActivity(), "Welcome", Toast.LENGTH_SHORT).show();
                dismiss();

            }

        });
        exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();

            }
        });
        return builder.create();

    }



}
