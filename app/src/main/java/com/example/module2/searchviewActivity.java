package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class searchviewActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchview);


        searchView = (SearchView) findViewById(R.id.searchbar);
        listView = (ListView) findViewById(R.id.searchlist);

        list = new ArrayList<>();
        list.add("Asif");
        list.add("Ashitha");
        list.add("Anusha");
        list.add("Anupama");
        list.add("Bhavana");
        list.add("Divin");
        list.add("Harvin");
        list.add("Varghese");
        list.add("Vismaya");
        list.add("Vincent");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(searchviewActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}