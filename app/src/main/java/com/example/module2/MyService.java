package com.example.module2;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;


import androidx.annotation.Nullable;

public class MyService extends Service {
    MediaPlayer mp;

    @Override
    public void onCreate() {
        super.onCreate();
        mp = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        mp = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);


        mp.start();
        return super.onStartCommand(intent,flags,startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
