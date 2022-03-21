package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SimpleListActivity extends AppCompatActivity {

    String names[] ={"Anupama","Anusha","Asif","Arya","Bhavana","Don","Harvin","Lamiya",
            "Shabna","Siril","Sajin","Varghese","Vismaya"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        ListView list = (ListView) findViewById(R.id.simplelistviewid);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, names);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selecteditem = (String) adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),"You selected "+selecteditem+" as classrep",Toast.LENGTH_LONG).show();
            }
        });



    }


}