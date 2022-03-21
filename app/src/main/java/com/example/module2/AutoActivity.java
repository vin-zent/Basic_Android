package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoActivity extends AppCompatActivity {
    AutoCompleteTextView btnAuto;
    String[] name = {"Aishwarya","akhil","Anusha","Anupama","Ashitha","Asif","Bhavana","Divya",
            "Don","Harvin","Lamiya","Neshwa","Sajin","Sanika","Shabna","Siril","Shinod","Varghese",
            "Vincent","Vismaya","Zen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        btnAuto =(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> Adapter =new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,name);

        btnAuto.setThreshold(1);
        btnAuto.setAdapter(Adapter);

    }
}