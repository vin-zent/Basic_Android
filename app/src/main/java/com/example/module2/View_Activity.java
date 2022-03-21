package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class View_Activity extends AppCompatActivity {
    Button btnrecycle,btnCard,btntabhost,btnsearch,btngrid,btnweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        btnrecycle= findViewById(R.id.recycle);
        btnrecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Activity.this,Recyle_Activity.class));
            }
        });


        btnCard= findViewById(R.id.card);
        btnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Activity.this,CardActivity.class));
            }
        });

        btntabhost= findViewById(R.id.tabhost);
        btntabhost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Activity.this,TabviewActivity.class));
            }
        });

        btnsearch= findViewById(R.id.search);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Activity.this,searchviewActivity.class));
            }
        });

        btngrid= findViewById(R.id.grid);
        btngrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Activity.this,GridViewActivity.class));
            }
        });

        btnweb= findViewById(R.id.web);
        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Activity.this,WebViewActivity.class));
            }
        });
    }
}