package com.example.fern_computer.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectLawType5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_law_type5);
        String select1 = getIntent().getStringExtra("lawtype5");

        switch (select1) {
            case "1":
                setContentView(R.layout.activity_type5_convucted1);
                break;
            case "2":
                setContentView(R.layout.activity_type5_convucted2);
                break;
            case "3":
                setContentView(R.layout.activity_type5_convucted3);
                break;
            case "4":
                setContentView(R.layout.activity_type5_convucted4);
                break;
            case "5":
                setContentView(R.layout.activity_type5_convucted5);
                break;
            case "6":
                setContentView(R.layout.activity_type5_convucted6);
                break;
            case "7":
                setContentView(R.layout.activity_type5_convucted7);
                break;
        }
    }
}
