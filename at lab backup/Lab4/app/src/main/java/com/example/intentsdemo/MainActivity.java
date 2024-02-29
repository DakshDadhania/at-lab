package com.example.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TRANS_NAME = "";
    Button btn;
    EditText etView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        etView = findViewById(R.id.editTextText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextView();

            }
        });
    }
    public void openNextView() {
        String name = etView.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TRANS_NAME, name);
        startActivity(intent);
    }
}