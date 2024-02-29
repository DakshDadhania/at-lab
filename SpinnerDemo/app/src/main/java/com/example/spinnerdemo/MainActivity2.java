package com.example.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView tv1;
    Button btn;
    EditText t1;
    EditText t2;
    EditText t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1 = findViewById(R.id.textView3);
        t1=findViewById(R.id.editTextText2);
        t2=findViewById(R.id.editTextPhone);
        t3=findViewById(R.id.editTextTextEmailAddress);
        Intent gintent = getIntent();
        String str = t1.getText().toString();

        int foo = Integer.parseInt(str);

        String str2 = t2.getText().toString();

        int foo2 = Integer.parseInt(str2);

        String str3 = t3.getText().toString();

        int foo3 = Integer.parseInt(str3);
        tv1.setText("Area " + "Circle" + 2.14*foo*foo+ "Square"+ foo2*foo2+ "Rectangle" + foo3*foo3  + "!");

        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Area \" + \"Circle\" + 2.14*foo*foo+ \"Square\"+ foo2*foo2+ \"Rectangle\" + foo3*foo3  + \"!" , Toast.LENGTH_LONG).show();
            }
        });
    }
}