package com.example.fern_computer.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AddictPhase extends AppCompatActivity {
    private String IdPhase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addict_phase);
        String[] str = { "ระยะที่1", "ระยะที่2", "ระยะที่3","ระยะที่4" };

        ListView listView1 = (ListView)findViewById(R.id.listView);
        listView1.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, str));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                Intent intent;
                switch (arg2) {
                    case 0:
                        intent = new Intent(getApplicationContext(), SelectAddictPhase.class);
                        intent.putExtra("IdPhase", "1");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), SelectAddictPhase.class);
                        intent.putExtra("IdPhase","2");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), SelectAddictPhase.class);
                        intent.putExtra("IdPhase","3");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), SelectAddictPhase.class);
                        intent.putExtra("IdPhase","4");
                        startActivity(intent);
                        break;


                }
            }
        });
    }

    public String getIdPhase() {
        return IdPhase;
    }

    public void setIdPhase(String idPhase) {
        IdPhase = idPhase;
    }
}