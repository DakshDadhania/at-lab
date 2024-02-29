package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView t1;
 TextView t2;
 CheckBox ch1;
 CheckBox ch2;
 CheckBox ch3;
 Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        ch1=findViewById(R.id.checkBox1);
        ch2=findViewById(R.id.checkBox2);
        ch3=findViewById(R.id.checkBox3);
        b1=findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder bulletlist1=new StringBuilder();
                 if(ch1.isChecked())
                 {bulletlist1.append("*").append(ch1.getText()).append("\n");}
                 if(ch2.isChecked()){bulletlist1.append("*").append(ch2.getText()).append("\n");}
                 if(ch3.isChecked()){bulletlist1.append("*").append(ch3.getText()).append("\n");}
                 t2.setText(bulletlist1.toString());

            }
        });


    }
}