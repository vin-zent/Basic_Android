package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Foregroundsevice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foregroundsevice);
        Button b1=findViewById(R.id.button33);
        Button b2=findViewById(R.id.button34);
        EditText e1=findViewById(R.id.txt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Foregroundsevice.this,Myservicefor.class);
                i.putExtra("input",e1.getText().toString());
                startService(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Foregroundsevice.this,Myservicefor.class);
                stopService(i);
            }
        });
    }
}