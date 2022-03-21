package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicesActivity extends AppCompatActivity {

    Button Stopbtn, Startbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Startbtn= findViewById(R.id.Startbtn);
        Stopbtn = findViewById(R.id.Stopbtn);

        Startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(),MyService.class));

            }
        });

        Stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(),MyService.class));
            }
        });
    }
}