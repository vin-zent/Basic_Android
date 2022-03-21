package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridView = findViewById(R.id.grid_View);

        final String[] text = {"Aishwarya","akhil","Anusha","Anupama","Ashitha","Asif","Bhavana","Divya",
                "Don","Harvin","Lamiya","Neshwa","Sajin","Sanika","Shabna","Siril","Shinod","Varghese",
                "Vincent","Vismaya","Zen"};

        mAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, text);

        // set Adapter to GridView
        gridView.setAdapter(mAdapter);

        // Click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(getApplicationContext(),text[position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}