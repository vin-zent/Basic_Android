package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listview_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Button simlist =(Button)findViewById(R.id.simplelistButton);
        simlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(listview_Activity.this,SimpleListActivity.class));
            }
        });

        Button custlist =(Button)findViewById(R.id.customlistButton);
        custlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(listview_Activity.this,CustomlistActivity.class));
            }
        });

        Button dynamic = findViewById(R.id.dynamiclist);
        dynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(listview_Activity.this,DynamiclistActivity.class));
            }
        });

        Button expan = findViewById(R.id.expandablelistButton);
        expan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(listview_Activity.this,ExpandableActivity.class));
            }
        });

    }
}