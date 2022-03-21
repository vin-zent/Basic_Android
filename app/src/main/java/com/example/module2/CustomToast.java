package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        Button makeCustom =(Button)findViewById(R.id.MakeCustomtoast);
        makeCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater =getLayoutInflater();
                View layout=inflater.inflate(R.layout.customm_toast,(ViewGroup)findViewById(R.id.toast_container));

//                ImageView image = layout.findViewById(R.id.Simle);
//                TextView txt = layout.findViewById(R.id.thankyou);

                Toast toast =new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}