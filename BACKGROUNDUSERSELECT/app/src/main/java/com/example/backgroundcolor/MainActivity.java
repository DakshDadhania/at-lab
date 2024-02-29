package com.example.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
 RadioButton r1;
 RadioButton r2;
 RadioGroup r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.radioButton1);
        r2 = findViewById(R.id.radioButton2);
        r = findViewById(R.id.radiog);
       r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               if(checkedId==r1.getId())
               { getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));}
               else if(checkedId==r2.getId())
               { getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));}

           }
       });

    }
}