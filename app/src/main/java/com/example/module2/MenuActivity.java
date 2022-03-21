package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button Option,context,popupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Option=findViewById(R.id.option);
        context=(Button) findViewById(R.id.cmenu);
        popupbtn=findViewById(R.id.popup);

        Option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this,OptionMenu.class));
            }
        });

        context.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this,ContextActivity.class));
            }
        });

        popupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this,PopUpActivity.class));
            }
        });

    }
}