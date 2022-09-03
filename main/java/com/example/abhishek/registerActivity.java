package com.example.abhishek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity {
ListView lst1obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        lst1obj=findViewById(R.id.lst1);
        lst1obj.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Toast.makeText(getApplicationContext(),"mango selected",Toast.LENGTH_SHORT).show();
                }
               else if(i==1)
                {
                    Toast.makeText(getApplicationContext(),"banana selected",Toast.LENGTH_SHORT).show();
                }
               else if(i==2)
                {
                    Toast.makeText(getApplicationContext(),"kiwi selected",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}