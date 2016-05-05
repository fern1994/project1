package com.example.fern_computer.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LawType2 extends AppCompatActivity {
    private String lawtype2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_type2);
        String[] str = { "ผลิต นำเข้า ส่งออก", "จำหน่าย ครอบครองเพื่อจำหน่าย", "ครอบครอง","เสพ", "ใช้อุบายหลอกลวง ขู่เข็ญ ใช้กำลัง ประทุษร้าย ข่มขืนใจผู้อื่นให้เสพ","ยุยงส่งเสริมให้ผู้อื่นเสพ" };

        ListView listView1 = (ListView)findViewById(R.id.listView);
        listView1.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, str));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                Intent intent;
                switch (arg2) {
                    case 0:
                        intent = new Intent(getApplicationContext(), SelectLawType2.class);
                        intent.putExtra("lawtype2", "1");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), SelectLawType2.class);
                        intent.putExtra("lawtype2", "2");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), SelectLawType2.class);
                        intent.putExtra("lawtype2", "3");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), SelectLawType2.class);
                        intent.putExtra("lawtype2", "4");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), SelectLawType2.class);
                        intent.putExtra("lawtype2", "5");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), SelectLawType2.class);
                        intent.putExtra("lawtype2", "6");
                        startActivity(intent);
                        break;

                }
            }
        });
    }

    public String getLawtype2() {
        return lawtype2;
    }

    public void setLawtype2(String lawtype2) {
        this.lawtype2 = lawtype2;
    }
}
