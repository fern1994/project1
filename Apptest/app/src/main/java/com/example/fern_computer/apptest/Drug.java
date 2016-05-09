package com.example.fern_computer.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Drug extends AppCompatActivity {
        private String Id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug);

        String[] str = { "ฝิ่น", "มอร์ฟีน", "เฮโรอีน","สารระเหย", "ยาบ้า", "ยาไอซ์", "ยาอี", "กระท่อม", "โคเคน", "เเอลเอสดี", "เห็ดขี้ควาย", "ยาเค", "กัญชา" };

ListView listView1 = (ListView)findViewById(R.id.listView);
listView1.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, str));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
        long arg3) {
        Intent intent;
        switch (arg2) {
        case 0:
                intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "1");
                startActivity(intent);

        break;
        case 1: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "2");
                startActivity(intent);
        break;
        case 2: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "3");
                startActivity(intent);
        break;
        case 3: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "4");
                startActivity(intent);
        break;
        case 4: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "5");
                startActivity(intent);
        break;
        case 5: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "6");
                startActivity(intent);
        break;
        case 6: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "7");
                startActivity(intent);
        break;
        case 7: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "8");
                startActivity(intent);
        break;
        case 8: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "9");
                startActivity(intent);
        break;
        case 9: intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "10");
                startActivity(intent);
        break;
        case 10:intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "11");
                startActivity(intent);
        break;
        case 11:intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "12");
                startActivity(intent);
        break;
        case 12:intent = new Intent(getApplicationContext(), SelectDrug.class);
                intent.putExtra("Id", "13");
                startActivity(intent);
        break;

        }
        }
        });
    }


        public String getId() {
                return Id;
        }

        public void setId(String id) {
                Id = id;
        }
}
