package com.example.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class broad_cast_Activity extends AppCompatActivity {
    AeroplaneActive aero = new AeroplaneActive();
    LottieAnimationView airanime ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);
        airanime = (LottieAnimationView) findViewById(R.id.aeroanime);
    }
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(aero, filter);
        airanime.playAnimation();
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(aero);

    }
}