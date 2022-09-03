package com.example.firebase;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;


public class Mcq extends AppCompatActivity {

public static ArrayList<model> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq);
        list=new ArrayList<>();
        list.add(new model("The Central Rice Research Station is situated in?"," Chennai","Cuttack","Bangalore","Quilon"," Cuttack"));
        list.add(new model("Who among the following wrote Sanskrit grammar?","Kalidasa","Charak","Panini","Aryabhatt","Panini"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Mcq.this,topics.class);
                startActivity(i);
            }
        },1500);
    }
}



