package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnpobj,btncalcolcobj,btnimgobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncalcolcobj=findViewById(R.id.btncalc);
        btnpobj=findViewById(R.id.btnp);
        btnimgobj=findViewById(R.id.btnimg);
        btnpobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });
        btncalcolcobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,calcActivity2.class);
                startActivity(i);
            }
        });
        btnimgobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ImageviewActivity.class);
                startActivity(i);
            }
        });

    }
}