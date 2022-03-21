package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableActivity extends AppCompatActivity {

    ExpandableListView expandableListViewexe;
    ExpandableListAdapter listAdapter;
    List<String> Listtitle ;
    HashMap<String,List<String>> DetailedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable);

        expandableListViewexe = (ExpandableListView) findViewById(R.id.explist);
        DetailedList =Expandablelistdata.getData();
        Listtitle =new ArrayList<String>(DetailedList.keySet());
        listAdapter = new CustomisedExpand(this ,Listtitle, DetailedList);
        expandableListViewexe.setAdapter(listAdapter);


        expandableListViewexe.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(), Listtitle.get(groupPosition) + " List Expanded.", Toast.LENGTH_SHORT).show();

            }

        });

        expandableListViewexe.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(), Listtitle.get(groupPosition) + " List Collapsed.", Toast.LENGTH_SHORT).show();

            }

        });

        expandableListViewexe.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(getApplicationContext(), Listtitle.get(groupPosition)
                        + " -> "
                        + DetailedList.get(
                        Listtitle.get(groupPosition)).get(
                        childPosition), Toast.LENGTH_SHORT
                ).show();
                return false;
            }

        });
    }
}