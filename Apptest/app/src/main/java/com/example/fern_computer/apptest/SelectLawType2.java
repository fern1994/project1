package com.example.fern_computer.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectLawType2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_law_type2);
        String select = getIntent().getStringExtra("lawtype2");

        switch (select) {
            case "1":
                setContentView(R.layout.activity_type2_convucted1);
                break;
            case "2":
                setContentView(R.layout.activity_type2_convucted2);
                break;
            case "3":
                setContentView(R.layout.activity_type2_convucted3);
                break;
            case "4":
                setContentView(R.layout.activity_type2_convucted4);
                break;
            case "5":
                setContentView(R.layout.activity_type2_convucted5);
                break;
            case "6":
                setContentView(R.layout.activity_type2_convucted6);
                break;
        }
    }
}
