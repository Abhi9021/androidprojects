package com.example.bcs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class chk1 extends AppCompatActivity {
CheckBox chk1obj,chk2obj,chk3obj;
Button btncheckobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chk1);
        btncheckobj=findViewById(R.id.btncheck);
        chk1obj=findViewById(R.id.chk1);
        chk2obj=findViewById(R.id.chk2);
        chk3obj=findViewById(R.id.chk3);

        btncheckobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chk1obj.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Ganeshwadi selected",Toast.LENGTH_SHORT).show();
                }
                if(chk2obj.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"mumbai selected",Toast.LENGTH_SHORT).show();
                }
                if(chk3obj.isChecked()) {
                    Toast.makeText(getApplicationContext(), "pune selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}