package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {
    Button SubmitButton;
    CheckBox Check1,Check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        SubmitButton = (Button)findViewById(R.id.submit);
        Check1 =(CheckBox) findViewById(R.id.checkBox);
        Check2 = (CheckBox) findViewById(R.id.checkBox2);

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Check1.isChecked() && Check2.isChecked()){
                    Toast.makeText(CheckActivity.this, "Checked:"+Check1.getText().toString()+"\n"+"Checked:"+Check2.getText().toString(), Toast.LENGTH_SHORT).show();

                }
                else if (Check1.isChecked()){
                    Toast.makeText(CheckActivity.this, "Checked: "+Check1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (Check2.isChecked()){
                    Toast.makeText(CheckActivity.this, "Checked :"+Check2.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(CheckActivity.this, "Please Click any", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}