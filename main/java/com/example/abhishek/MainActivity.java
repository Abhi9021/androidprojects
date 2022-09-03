package com.example.abhishek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
MenuItem miredobj,migreenobj;
LinearLayout rltobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rltobj=findViewById(R.id.rlt);
        miredobj=findViewById(R.id.mired);
        migreenobj=findViewById(R.id.migreen);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){
            case R.id.mired:
                rltobj.setBackgroundColor(Color.RED);
                return true;
            case R.id.migreen:
                rltobj.setBackgroundColor(Color.GREEN);
                return true;
            default:
                return  true;
        }
    }
}