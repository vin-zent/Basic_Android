package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Buttonui,Buttonmenu,Life , toastCustom,list_view,btnservice,btnbroadcast,btnview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttonui=findViewById(R.id.uibtn);
        Buttonmenu =findViewById(R.id.menubtn);

        Buttonui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

        Buttonmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MenuActivity.class));
            }
        });

        Life=(Button)findViewById(R.id.lifeCycle);
        Life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LifeCycleActivity.class));
            }
        });

        toastCustom = (Button) findViewById(R.id.costumItems);
        toastCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CustomBuutonsActivity.class));
            }
        });

        list_view=(Button) findViewById(R.id.listview_item);
        list_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,listview_Activity.class));
            }
        });

        btnservice = findViewById(R.id.serviceact);
        btnservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TwoserviceActivity.class));

            }
        });

        btnbroadcast =findViewById(R.id.broadcat);
        btnbroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,broad_cast_Activity.class));


            }
        });

        btnview =findViewById(R.id.weiv);
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, View_Activity.class));
            }
        });

        Button btnsms =findViewById(R.id.msgbroad);
        btnsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SmsBroadActivity.class));
            }
        });

    }
}