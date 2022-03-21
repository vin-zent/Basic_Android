package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist);

        ListView list = (ListView) findViewById(R.id.listCustom);

        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();
        arrayList.add(new SubjectData("Previewed App(Mockup)","https://previewed.app",R.drawable.previewedapp));
        arrayList.add(new SubjectData("doodleipsum.com (Illustration pack)","https://doodleipsum.com/",R.drawable.doodle));
        arrayList.add(new SubjectData("FontandColors.com","https://fontandcolors.com",R.drawable.fontandcolors));
        arrayList.add(new SubjectData("Adobe-colors(For color-pallette)","https://www.adobe.com/in/products/color.html",R.drawable.adobecolor));
        arrayList.add(new SubjectData("Creative market(mockups and fonts)","https://creativemarket.com/?u=apenriquez",R.drawable.creative_market_logo));

        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        list.setAdapter(customAdapter);
    }
}