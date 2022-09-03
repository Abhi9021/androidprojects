package com.example.bcs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class menu1 extends AppCompatActivity {
LinearLayout rlt1obj;
MenuItem miredobj,migreenobj,miblueobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        rlt1obj = findViewById(R.id.rlt1);
        miredobj = findViewById(R.id.mired);
        migreenobj = findViewById(R.id.migreen);
        miblueobj = findViewById(R.id.miblue);
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu)
        {
            getMenuInflater().inflate(R.menu.mymenu, menu);
            return true;
        }
        @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
        {
            switch (menuItem.getItemId())
            {
                case  R.id.mired:
                    rlt1obj.setBackgroundColor(Color.RED);
                    return  true;
                case R.id.migreen:
                    rlt1obj.setBackgroundColor(Color.GREEN);
                    return  true;
                case  R.id.miblue:
                    rlt1obj.setBackgroundColor(Color.BLUE);
                    return  true;
                default:
                    return  true;
            }
        }

}