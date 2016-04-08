package com.example.fern_computer.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectLawType1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_law_type1);
        String select = getIntent().getStringExtra("lawtype1");

        switch (select) {
            case "1":
                setContentView(R.layout.activity_type1_convicted1);
                break;
            case "2":
                setContentView(R.layout.activity_type1_convucted2);
                break;
            case "3":
                setContentView(R.layout.activity_type1_convucted3);
                break;
            case "4":
                setContentView(R.layout.activity_type1_convucted4);
                break;
            case "5":
                setContentView(R.layout.activity_type1_convucted5);
                break;
            case "6":
                setContentView(R.layout.activity_type1_convucted6);
                break;
            case "7":
                setContentView(R.layout.activity_type1_convucted7);
                break;
        }
    }
}
