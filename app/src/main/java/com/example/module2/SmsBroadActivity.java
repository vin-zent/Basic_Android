package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class SmsBroadActivity extends AppCompatActivity {
    SmsActive aero = new SmsActive();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_broad);
//        if(ContextCompat.checkSelfPermission(SmsBroadActivity.this,
//                Manifest.permission.RECEIVE_SMS)== PackageManager.PERMISSION_DENIED){
//            ActivityCompat.requestPermissions(SmsBroadActivity.this,
//                    new String[]{Manifest.permission.RECEIVE_SMS},0);
//        }
//        else{
//            Toast.makeText(SmsBroadActivity.this, "Premission given", Toast.LENGTH_SHORT).show();
//        }

    }
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(aero, filter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(aero);

    }


}