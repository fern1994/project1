package com.ks5630213032.alertdatetime;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button selectButton;
    Button stopButton;
    private static Button alertButton;
    int year_x, month_x, day_x;
    static final int DIALOG_ID = 0;
    Button detailButton;
    Button showButton;
    NotificationManager notificationManager;
    boolean isNotificActive = false;
    int notifID = 33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialogOnButtonClick();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onButtonClickLisener();

        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);

        detailButton = (Button)findViewById(R.id.detailButton);
        showButton = (Button)findViewById(R.id.showButton);
        stopButton = (Button)findViewById(R.id.stopButton);


    }

        public void showDialogOnButtonClick() {
            selectButton = (Button)findViewById(R.id.selectButton);

            selectButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDialog(DIALOG_ID);

                }
            }
            );
        }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id==DIALOG_ID)
            return new DatePickerDialog(this, dpickerListener, year_x, month_x, day_x);
            return null;
        }

    private DatePickerDialog.OnDateSetListener dpickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            year_x = year;
            month_x = monthOfYear + 1;
            day_x = dayOfMonth;
            Toast.makeText(MainActivity.this, year_x + "/" + month_x + "/" + day_x, Toast.LENGTH_LONG).show();
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), DetailMeeting.class);
        startActivity(intent);

    }

    public void onClickShow(View view) {
        NotificationCompat.Builder notificBuilder = new NotificationCompat.Builder(this)
                .setContentTitle("Message")
                .setContentText("New Message")
                .setTicker("Don't forget the meeting in tomorrow!!!")
                .setSmallIcon(R.drawable.logo);

        Intent moreInfoIntent = new Intent(this, MoreInfoNotification.class);

        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(this);

        taskStackBuilder.addParentStack(MoreInfoNotification.class);

        taskStackBuilder.addNextIntent(moreInfoIntent);

        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(0, PendingIntent
                .FLAG_UPDATE_CURRENT);

        notificBuilder.setContentIntent(pendingIntent);

        notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(notifID, notificBuilder.build());

        isNotificActive = true;
    }


    public void onClickStop(View view) {
        if (isNotificActive){
            notificationManager.cancel(notifID);
        }

    }

    public void onButtonClickLisener() {
        alertButton = (Button)findViewById(R.id.alertButton);
        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                a_builder.setMessage("You have to meet Mr.A in tomorrow.").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = a_builder.create();
                alert.setTitle("Alert !!!");
                alert.show();

            }

        });


} }
