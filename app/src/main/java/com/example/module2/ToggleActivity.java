package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {
    private ToggleButton Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        Button = (ToggleButton) findViewById(R.id.buttonToggle);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Button.isChecked()){
                    Toast.makeText(getApplicationContext(),"Togglebutton is:"+Button.getText().toString(),Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Togglebutton is "+Button.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}