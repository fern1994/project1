package com.example.fern_computer.apptest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calendar extends AppCompatActivity {

    NotificationManager nManager;
    int NOTFICATION_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Button cmdNoti = (Button)findViewById(R.id.button);
        cmdNoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Calendar.this, AlertActivity.class);
                PendingIntent pI = PendingIntent.getActivity(Calendar.this, 0, i, 0);

                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
                NotificationCompat.Builder nb = new NotificationCompat.Builder(Calendar.this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setLargeIcon(bmp).setTicker("แจ้งเตือน")
                        .setContentTitle("วิ้งงงงงงงงงง")
                        .setContentIntent(pI).setAutoCancel(true);

                Notification n = nb.build();
                nManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nManager.notify(NOTFICATION_ID, n);
            }
        });
        Button cmdCancle = (Button)findViewById(R.id.button2);
        cmdCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nManager.cancel(NOTFICATION_ID);
            }
        });
    }
}
