package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Imagebutton extends AppCompatActivity {
    private ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagebutton);

        btn = (ImageButton) findViewById(R.id.imageButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Imagebutton.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}