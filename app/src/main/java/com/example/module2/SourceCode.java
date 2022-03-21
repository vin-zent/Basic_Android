package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SourceCode extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_code);
        t1=findViewById(R.id.textView7);
        Intent i=getIntent();
        t1.setText(i.getStringExtra("sc"));
    }
}