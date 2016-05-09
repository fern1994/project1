package com.example.fern_computer.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectLawType3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_law_type3);
        String select = getIntent().getStringExtra("lawtype3");

        switch (select) {
            case "1":
                setContentView(R.layout.activity_type3_convucted1);
                break;
            case "2":
                setContentView(R.layout.activity_type3_convucted2);
                break;
            case "3":
                setContentView(R.layout.activity_type3_convucted3);
                break;
            case "4":
                setContentView(R.layout.activity_type3_convucted4);
                break;
        }

    }
}
