package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomAlertActivity extends AppCompatActivity {
    final Context context= this;
    Button DisplayAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert);

        DisplayAlert =(Button) findViewById(R.id.alertbtncus);
        DisplayAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.alertcustom);
                Button dialogButton = (Button) dialog.findViewById(R.id.okCustom);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(),"woow this is great...LOL",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }
}