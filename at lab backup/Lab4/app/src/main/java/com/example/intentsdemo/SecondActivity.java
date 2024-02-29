package com.example.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {
    TextView tv1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1 = findViewById(R.id.textView3);
        Intent gintent = getIntent();
        String name = gintent.getStringExtra(MainActivity.TRANS_NAME);
        tv1.setText("Hello " + name + "!");
        btn = findViewById(R.id.button2);

    }

}