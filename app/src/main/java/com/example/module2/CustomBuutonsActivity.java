package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomBuutonsActivity extends AppCompatActivity {
    Button Customtoastbtn,Cusalertbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_buutons);

        Customtoastbtn = (Button) findViewById(R.id.toastbtn);
        Customtoastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CustomBuutonsActivity.this, CustomToast.class));
            }
        });

        Cusalertbtn =(Button) findViewById(R.id.cusalertbtn);
        Cusalertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CustomBuutonsActivity.this, CustomAlertActivity.class));
            }
        });

    }
}