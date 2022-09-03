package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageviewActivity extends AppCompatActivity {
ImageView img1obj;
TextView txtimgobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        img1obj=findViewById(R.id.img1);
        txtimgobj=findViewById(R.id.txtimg);
        img1obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtimgobj.setText("1234567890\tBodhwadabhishek@gmail.com");
            }
        });
    }
}