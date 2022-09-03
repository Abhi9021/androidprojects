package com.example.firstproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
Context cnt=this;
EditText edtresultobj,edtinputobj;
Button btnpromptobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtinputobj=findViewById(R.id.edtinput);
        edtresultobj=findViewById(R.id.edtresult);
        btnpromptobj=findViewById(R.id.btnprompt);
        btnpromptobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater li=LayoutInflater.from(cnt);
                View pview=li.inflate(R.layout.prompt,null);
                AlertDialog.Builder b=new AlertDialog.Builder(cnt);
                b.setView(pview);
                EditText userinput=(EditText) pview.findViewById(R.id.edtinput);
                b.setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        edtresultobj.setText(userinput.getText());
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog al=b.create();
                al.show();
            }
        });
    }
}