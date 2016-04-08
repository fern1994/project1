package com.example.fern_computer.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectAddictPhase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String select = getIntent().getStringExtra("IdPhase");

        switch (select){
            case "1" :
                setContentView(R.layout.activity_phase1);
                break;
            case "2" :
                setContentView(R.layout.activity_phase2);
                break;
            case "3" :
                setContentView(R.layout.activity_phase3);
                break;
            case "4" :
                setContentView(R.layout.activity_phase4);
                break;
        }
    }
}
