package com.example.lab2lauretahanne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText c
            ;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c = findViewById(R.id.editText9);
    }
    public void check(View v) {
        SharedPreferences sp = getSharedPreferences("mydata", MODE_PRIVATE);
        String spc1 = sp.getString("course1", null);
        String spc2 = sp.getString("course2", null);
        String spc3 = sp.getString("course3", null);
        String spc4 = sp.getString("course4", null);
        String spc5 = sp.getString("course5", null);
        String spc6 = sp.getString("course6", null);
        String spc7 = sp.getString("course7", null);
        String spc8 = sp.getString("course8", null);

        String course = c.getText().toString();

        if (course.equals(spc1) || course.equals(spc2) || course.equals(spc3) || course.equals(spc4) || course.equals(spc5) || course.equals(spc6) || course.equals(spc7) || course.equals(spc8)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Course is Not Offered in UST...", Toast.LENGTH_LONG).show();
        }
    }



    public void dispPrev(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}