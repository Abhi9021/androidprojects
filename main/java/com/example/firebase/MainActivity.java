package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    EditText Email,Pass;
    Button login,register;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.email);
        Pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        auth = FirebaseAuth.getInstance();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email =Email.getText().toString();
                String txt_pass =Pass.getText().toString();

                if(TextUtils.isEmpty(txt_email)||TextUtils.isEmpty(txt_pass)){
                    Toast.makeText(MainActivity.this,
                            "empty",Toast.LENGTH_LONG).show();
                }else if(txt_pass.length()<6){
                    Toast.makeText(getApplicationContext(),"password is short",Toast.LENGTH_LONG).show();
                }else {
                    loginuser(txt_email,txt_pass);
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        MainActivity2.class));
            }
        });
    }
    public void loginuser(String email,String password){
        auth.createUserWithEmailAndPassword(email,
                password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Toast.makeText(MainActivity.this,"login successful",Toast.LENGTH_LONG).show();
                        startActivity(new Intent(MainActivity.this,login.class));
            }
        });


    }
}