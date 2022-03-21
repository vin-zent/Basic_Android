package com.example.module2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class Myservicefor extends Service {
    private final String CHANNEL_ID="personal_notifications";
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent i=new Intent(this,Foregroundsevice.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,i,0);
        createNotificationChannel();
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle("Foreground Service")
                .setContentText(intent.getStringExtra("input"))
                .setSmallIcon(R.drawable.ic_message)
                .setContentIntent(pendingIntent)
                .build();
        startForeground(1, notification);

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void createNotificationChannel()
    {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            CharSequence name = "Personal Notifications";
            String description = "Include all the personal notification";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel notificationChannel=new NotificationChannel(CHANNEL_ID,name,importance);
            notificationChannel.setDescription(description);

            NotificationManager notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
