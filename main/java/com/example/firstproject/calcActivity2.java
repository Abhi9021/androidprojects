package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class calcActivity2 extends AppCompatActivity {
EditText edtinputobj;
Button btncobj,btnmodulusobj,btndividionobj,btn1obj,btn2obj,btn3obj,btn4obj,btn5obj,btn6obj,btn7obj,btn8obj,btn9obj,btn0obj,btndotobj,btnmultiobj,btndubobj,btnsubobj,btnaddobj,btnequlobj;
ImageButton btnbackobj;
float num1,num2;
boolean add,sub,mul,div,mod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc2);
        btncobj=findViewById(R.id.btnc);
        btnbackobj=findViewById(R.id.btnback);
        btnmodulusobj=findViewById(R.id.btnmodule);
        btndividionobj=findViewById(R.id.btndivision);
        btn1obj=findViewById(R.id.btn1);
        btn2obj=findViewById(R.id.btn2);
        btn3obj=findViewById(R.id.btn3);
        btn4obj=findViewById(R.id.btn4);
        btn5obj=findViewById(R.id.btn5);
        btn6obj=findViewById(R.id.btn6);
        btn7obj=findViewById(R.id.btn7);
        btn8obj=findViewById(R.id.btn8);
        btn8obj=findViewById(R.id.btn8);
        btn9obj=findViewById(R.id.btn9);
        btn0obj=findViewById(R.id.btn0);
        btnmultiobj=findViewById(R.id.btnmulti);
        btnaddobj=findViewById(R.id.btnadd);
        btnequlobj=findViewById(R.id.btnequl);
        btndotobj=findViewById(R.id.btndot);
        btnsubobj=findViewById(R.id.btnsub);
        edtinputobj=findViewById(R.id.edtinput);
        btn1obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"1");
            }
        });
        btn2obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"2");
            }
        });
        btn3obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"3");
            }
        });
        btn4obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"4");
            }
        });
        btn5obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"5");
            }
        });
        btn6obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"6");
            }
        });
        btn7obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"7");
            }
        });
        btn8obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"8");
            }
        });
        btn9obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"9");
            }
        });
        btn0obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(edtinputobj.getText()+"0");
            }
        });
        btncobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtinputobj.setText(" ");
            }
        });
        btnbackobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=edtinputobj.getText().toString();
                if(str.length()>1)
                {
                    str=str.substring(0,str.length()-1);
                    edtinputobj.setText(str);
                }
                else if(str.length()<=1)
                {
                    edtinputobj.setText(" ");
                }
            }
        });

        btnaddobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 num1=Float.parseFloat(edtinputobj.getText()+"");
                add=true;
                edtinputobj.setText(null);
            }
        });

        btnmodulusobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(edtinputobj.getText()+"");
                mod=true;
                edtinputobj.setText(null);
            }
        });
        btnsubobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(edtinputobj.getText()+"");
                sub=true;
                edtinputobj.setText(null);
            }
        });
        btnmultiobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(edtinputobj.getText()+"");
                mul=true;
                edtinputobj.setText(null);
            }
        });
        btndividionobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat(edtinputobj.getText()+"");
                div=true;
                edtinputobj.setText(null);
            }
        });
        btnequlobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2=Float.parseFloat(edtinputobj.getText()+"");
                if(add==true)
                {
                    edtinputobj.setText(num1+num2+"");
                    add=false;
                }
                if(sub==true)
                {
                    edtinputobj.setText(num1-num2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    edtinputobj.setText(num1*num2+"");
                    mul=false;
                }

                if(div==true)
                {
                    edtinputobj.setText(num1/num2+"");
                    div=false;
                }
                if(mod==true)
                {
                    edtinputobj.setText(num1%num2+"");
                    mod=false;
                }
            }
        });
btndotobj.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edtinputobj.setText(edtinputobj.getText()+".");
    }
});

    }
}