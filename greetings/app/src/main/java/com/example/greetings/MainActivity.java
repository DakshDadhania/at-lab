package com.example.greetings;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext=findViewById(R.id.editTextText);
        Button button=findViewById(R.id.button);
        RadioButton r1=findViewById(R.id.radioButton);
        RadioButton r2=findViewById(R.id.radioButton2);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredText = edittext.getText().toString();
                Toast.makeText(MainActivity.this, "Hello, " + enteredText + "!", Toast.LENGTH_LONG).show();
                String selectedRadioButtonText = "";
                // Check which RadioButton is checked
                if (r1.isChecked()) {
                    selectedRadioButtonText = r1.getText().toString();
                } else if (r2.isChecked()) {
                    selectedRadioButtonText = r2.getText().toString();
                }

                // Display the selected text in an AlertDialog
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setTitle("Greetings");
                alertDialogBuilder.setMessage("Hello"+"! You selected: " + selectedRadioButtonText);
                alertDialogBuilder.setPositiveButton("OK", null);
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                spinner = findViewById(R.id.spinner);
                String[] courses = {"C++", "JAVA", "PYTHON"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, courses);
                spinner.setAdapter(adapter);



            }
        });

        //String enteredText = edittext.getText().toString();
        //Toast.makeText(MainActivity.this, "Hello, " + enteredText + "!", Toast.LENGTH_LONG).show();



    }
}