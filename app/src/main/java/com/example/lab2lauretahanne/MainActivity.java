package com.example.lab2lauretahanne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etc1, etc2, etc3, etc4, etc5, etc6, etc7, etc8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etc1 = findViewById(R.id.editText);
        etc2 = findViewById(R.id.editText2);
        etc3 = findViewById(R.id.editText3);
        etc4 = findViewById(R.id.editText4);
        etc5 = findViewById(R.id.editText5);
        etc6 = findViewById(R.id.editText6);
        etc7 = findViewById(R.id.editText7);
        etc8 = findViewById(R.id.editText8);
    }

    public void saveData(View v) {
        SharedPreferences sp = getSharedPreferences("mydata", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String c1 = etc1.getText().toString();
        String c2 = etc2.getText().toString();
        String c3 = etc3.getText().toString();
        String c4 = etc4.getText().toString();
        String c5 = etc5.getText().toString();
        String c6 = etc6.getText().toString();
        String c7 = etc7.getText().toString();
        String c8 = etc8.getText().toString();

        editor.putString("course1", c1);
        editor.putString("course2", c2);
        editor.putString("course3", c3);
        editor.putString("course4", c4);
        editor.putString("course5", c5);
        editor.putString("course6", c6);
        editor.putString("course7", c7);
        editor.putString("course8", c8);

        editor.commit();
        Toast.makeText(this, "Course Saved", Toast.LENGTH_LONG).show();

    }

    public void dispNext(View v) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }
}