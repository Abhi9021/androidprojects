package com.example.firebase;


import static com.example.firebase.Mcq.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class topics extends AppCompatActivity {
CountDownTimer countDownTimer;
TextView txtobj;
Button next,back;
List<model> allq;
model m;
int index=0;
CardView card1obj;
TextView txt1,txt2,txt3,txt4,txtq;
Button op1,op2,op3,op4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        mocks();
        txtobj=findViewById(R.id.txttimer);
        next=findViewById(R.id.btnnext);
        back=findViewById(R.id.btnback);
        allq=list;
        Collections.shuffle(allq);
        m=list.get(index);
        setAllData();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(topics.this,topics.class);
                startActivity(i);
            }
        });

                countDownTimer=new CountDownTimer(30000,1000) {
                    @Override
                    public void onTick(long l) {
txtobj.setText(""+l/1000);
                    }

                    @Override
                    public void onFinish() {
                        Dialog dialog=new Dialog(topics.this);
                        dialog.setContentView(R.layout.timeoutdialog);
                        dialog.show();
                        dialog.findViewById(R.id.txttry).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent i=new Intent(topics.this,topics.class);
                                startActivity(i);
                            }
                        });
                    }
                }.start();





    }

    private void setAllData() {
      txtq.setText(m.getQuestions());
      txt1.setText(m.getOpA());
      txt2.setText(m.getOpB());
      txt3.setText(m.getOpC());
      txt4.setText(m.getOpD());
    }

    private void mocks() {
    card1obj=findViewById(R.id.card1);
    op1=findViewById(R.id.A);
    op2=findViewById(R.id.B);
    op3=findViewById(R.id.C);
    op4=findViewById(R.id.D);

    txt1=findViewById(R.id.txta);
    txt2=findViewById(R.id.txtb);
    txt3=findViewById(R.id.txtc);
    txt4=findViewById(R.id.txtd);
    txtq=findViewById(R.id.carq);
    }
}
