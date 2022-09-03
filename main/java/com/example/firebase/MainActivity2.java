package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity2 extends AppCompatActivity {
    EditText Email,Pass;
    Button register;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Email = findViewById(R.id.email);
        Pass = findViewById(R.id.pass);
        register = findViewById(R.id.register);
        auth = FirebaseAuth.getInstance();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt_email =Email.getText().toString();
                String txt_pass =Pass.getText().toString();

                if(TextUtils.isEmpty(txt_email)|| TextUtils.isEmpty(txt_pass)){
                    Toast.makeText(getApplicationContext(),"empty",Toast.LENGTH_SHORT).show();
                }else if(txt_pass.length()<6){
                    Toast.makeText(MainActivity2.this, "password is short",Toast.LENGTH_LONG).show();
                }else {
                    registeruser(txt_email,txt_pass);
                }
            }
        });
    }
    private void registeruser(String email, String password){
        auth.createUserWithEmailAndPassword(email,
                password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(MainActivity2.this,"login is successful",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity2.this,"login is unsuccessful",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}