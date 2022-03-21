package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamiclistActivity extends AppCompatActivity {

    Button addbtn;
    EditText listtxt;
    ListView classlist;
    String [] arr ={"Anusha","Appu","Asif"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamiclist);
        classlist = findViewById(R.id.dynalist);
        addbtn = findViewById(R.id.addlistbtn);
        listtxt =findViewById(R.id.itemtext);

        final List<String> Arraylistitem = new ArrayList(Arrays.asList(arr));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Arraylistitem);
        classlist.setAdapter(adapter);



        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arraylistitem.add(listtxt.getText().toString());
                adapter.notifyDataSetChanged();
                listtxt.setText("");
            }
        });



    }
}