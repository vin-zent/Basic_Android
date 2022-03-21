package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoserviceActivity extends AppCompatActivity {

    Button forg, backg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoservice);

        forg =(Button) findViewById(R.id.forgroundser);
        backg =(Button) findViewById(R.id.backgroundser);
        backg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TwoserviceActivity.this,ServicesActivity.class));
            }
        });

        forg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TwoserviceActivity.this,Foregroundsevice.class));
            }
        });


    }
}