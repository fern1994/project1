package com.example.fern_computer.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectDrug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String select = getIntent().getStringExtra("Id");

        switch (select){
            case "1":
                setContentView(R.layout.activity_drug1);
                break;
            case "2":
                setContentView(R.layout.activity_drug2);
                break;
            case "3":
                setContentView(R.layout.activity_drug3);
                break;
            case "4":
                setContentView(R.layout.activity_drug4);
                break;
            case "5":
                setContentView(R.layout.activity_drug5);
                break;
            case "6":
                setContentView(R.layout.activity_drug6);
                break;
            case "7":
                setContentView(R.layout.activity_drug7);
                break;
            case "8":
                setContentView(R.layout.activity_drug8);
                break;
            case "9":
                setContentView(R.layout.activity_drug9);
                break;
            case "10":
                setContentView(R.layout.activity_drug10);
                break;
            case "11":
                setContentView(R.layout.activity_drug11);
                break;
            case "12":
                setContentView(R.layout.activity_drug12);
                break;
            case "13":
                setContentView(R.layout.activity_drug13);
                break;
        }
    }
}
