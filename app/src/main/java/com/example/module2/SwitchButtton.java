package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchButtton extends AppCompatActivity {
    private Switch ButtonSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_buttton);

        ButtonSwitch = (Switch) findViewById(R.id.switch1);

        ButtonSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ButtonSwitch.isChecked()){
                    Toast.makeText(getApplicationContext(),"SwitchButton is "+ButtonSwitch.getTextOn().toString(),Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "SwitchButton is "+ButtonSwitch.getTextOff().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}