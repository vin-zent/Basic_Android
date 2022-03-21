package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner btnSpinner;
    String[] Course = {"BSC","MVOC","BVOC","MSC","DIPLOMA","MCA","BCA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_button);

        btnSpinner =(Spinner)findViewById(R.id.spinner);
        btnSpinner.setOnItemSelectedListener(this);
        ArrayAdapter array = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Course);
        array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        btnSpinner.setAdapter(array);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this, Course[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}