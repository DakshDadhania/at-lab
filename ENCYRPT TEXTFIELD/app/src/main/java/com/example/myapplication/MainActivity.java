package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t1;
Button b1;
TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editTextText);
        b1=findViewById(R.id.button1);
        t2=findViewById(R.id.textView1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t1.getText().toString();
                StringBuilder s2=new StringBuilder();
                char c;

                if(!s.isEmpty())
                {   for(int i=0;i<s.length();i++)
                {   c=s.charAt(i);
                    c = Character.toLowerCase(c);
                    char nextLetter = (char) (((c - 'a' + 1) % 26) + 'a');
                    s2.append(nextLetter);
                }
                    Toast.makeText(MainActivity.this,s2.toString(),Toast.LENGTH_SHORT).show();}
                else
                {
                    Toast.makeText(MainActivity.this,"Please enter text and submit",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}