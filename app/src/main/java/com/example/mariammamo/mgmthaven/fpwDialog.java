package com.example.mariammamo.mgmthaven;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by mariammamo on 3/1/16.
 */
public class fpwDialog extends DialogFragment {
    LayoutInflater inflater;
    View v;
    //Button semail;

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.fpwdialog, null);
        Button sendemail = (Button) v.findViewById(R.id.sendemail);
        Button exit = (Button) v.findViewById(R.id.exit);

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v);
        sendemail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Email Sent", Toast.LENGTH_SHORT).show();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();

            }
        });
        return builder.create();

    }


}





