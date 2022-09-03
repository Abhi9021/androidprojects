package com.example.bcs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class switcha extends AppCompatActivity {
Switch sth1obj;
TextView txtsthobj;
boolean flash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switcha);
        sth1obj=findViewById(R.id.sth1);
        flash=getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
        sth1obj.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(flash){
                    if(sth1obj.getText().toString().contains("ON")){

                    }
                }
            }
        });
    }
}