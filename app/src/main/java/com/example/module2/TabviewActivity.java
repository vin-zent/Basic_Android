package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class TabviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabview);
        TabHost tabs = (TabHost) findViewById(R.id.tabhost);
        tabs.setup();
        TabHost.TabSpec spec = tabs.newTabSpec("tag1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("First");
        tabs.addTab(spec);
        spec = tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("second");
        tabs.addTab(spec);
    }
}