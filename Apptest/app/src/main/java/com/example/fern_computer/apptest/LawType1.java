package com.example.fern_computer.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LawType1 extends AppCompatActivity {
    private String lawtype1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_type1);

        String[] str = { "ผลิต นำเข้า ส่งออก", "จำหน่าย ครอบครอง เพื่อจำหน่าย", "ครอบครอง","เสพ","ใช้กลอุบายหลอกลวง ขู่เข็ญ ใช้กำลัง ประทุษร้าย ข่มขืนใจให้ผู้อื่เสพ","ใช้อุบายหลอกลวง ขู่เข็ญ ใช้กำลัง ประทุษร้าย ข่มขืนใจให้ผู้อื่นผลิต นำเข้า ส่งออก จำหน่าย ครอบครองเพื่อจำหน่าย ครอบครอง","ยุยงส่งเสริมให้ผู้อื่นเสพ" };

        ListView listView1 = (ListView)findViewById(R.id.listView);
        listView1.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, str));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                Intent intent;
                switch (arg2) {
                    case 0:
                        intent = new Intent(getApplicationContext(), SelectLawType1.class);
                        intent.putExtra("lawtype1", "1");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), SelectLawType1.class);
                        intent.putExtra("lawtype1", "2");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), SelectLawType1.class);
                        intent.putExtra("lawtype1", "3");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), SelectLawType1.class);
                        intent.putExtra("lawtype1", "4");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), SelectLawType1.class);
                        intent.putExtra("lawtype1", "5");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), SelectLawType1.class);
                        intent.putExtra("lawtype1", "6");
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), SelectLawType1.class);
                        intent.putExtra("lawtype1", "7");
                        startActivity(intent);
                        break;



                }
            }
        });
    }

    public String getLawtype1() {
        return lawtype1;
    }

    public void setLawtype1(String lawtype1) {
        this.lawtype1 = lawtype1;
    }
}
