package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {
    Button Submitrate;
    RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        Submitrate =(Button)findViewById(R.id.RateSubmit);
        rating=(RatingBar)findViewById(R.id.ratingBar);

        Submitrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rvalue = rating.getRating();
                Toast.makeText(RatingActivity.this, "RAting :"+rvalue, Toast.LENGTH_LONG).show();
            }
        });
    }
}