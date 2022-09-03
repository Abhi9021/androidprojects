package com.example.firebase;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class qpage extends AppCompatActivity implements q {
    FirebaseFirestore db;
    String  questName, opa, opb, opc, opd;
    int Ans;
    EditText qque;
    Button a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qpage);
        qque = findViewById(R.id.qque);
        a = findViewById(R.id.A);
        b = findViewById(R.id.B);
        c = findViewById(R.id.C);
        d = findViewById(R.id.D);
        getData();
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setBackgroundColor(Color.GREEN);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.setBackgroundColor(Color.GREEN);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.setBackgroundColor(Color.GREEN);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.setBackgroundColor(Color.GREEN);
            }
        });

    }


        void getData() {
            final DocumentReference documentReference = db.collection("java introduction").document("java basic");
            documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                @Override
                public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                    if (error != null) {
                        Log.w("TAG", error);
                        return;
                    }
                    if (value != null && value.exists()) {
                        Log.d("TAG", "Current Data" + value.getData());
                        questName = (String) value.getData().get("0Question");
                        opa = (String) value.getData().get("A");
                        opb = (String) value.getData().get("B");
                        opc = (String) value.getData().get("C");
                        opd = (String) value.getData().get("D");
                        Ans = (int) value.getLong("E").intValue();
                        qque.setText(questName);
                        a.setText(opa);
                        b.setText(opb);
                        c.setText(opc);
                        d.setText(opa);
                    } else {
                        Log.d("TAG", "Current Data:Null");
                    }
                }
            });
        }
}






