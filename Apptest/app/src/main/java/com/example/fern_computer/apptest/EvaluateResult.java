package com.example.fern_computer.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EvaluateResult extends AppCompatActivity implements View.OnClickListener {
    TextView getname,getsurname,getscore,gettype,geteval;
    EditText volunteernumber;
    String getName,getSurname,getType,getCardID,getAge,getAddress;
    int getScore;
    String score;
    Button putresult,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate_result);
        getname = (TextView)findViewById(R.id.tvresultname);
        getsurname = (TextView)findViewById(R.id.tvresultsurname);
        getscore = (TextView)findViewById(R.id.tvresultscore);
        geteval = (TextView)findViewById(R.id.tvresultevaluate);
        gettype = (TextView)findViewById(R.id.tvtype);

        volunteernumber = (EditText)findViewById(R.id.etvolunteer);

        putresult = (Button)findViewById(R.id.btnputresult);
        cancel = (Button)findViewById(R.id.btncancel);

        putresult.setOnClickListener(this);
        cancel.setOnClickListener(this);


        getName = getIntent().getStringExtra("Name");
        getSurname = getIntent().getStringExtra("Surname");
        getScore = getIntent().getIntExtra("Result", 0);
        getType = getIntent().getStringExtra("SelectType");
        getCardID = getIntent().getStringExtra("CardID");
        getAge = getIntent().getStringExtra("Age");
        getAddress = getIntent().getStringExtra("Address");

        score = String.valueOf(getScore);

        getname.setText("ชื่อผู้ป่วย: "+getName);
        getsurname.setText("สกุล: "+getSurname);
        getscore.setText("คะแนน: "+score);
        gettype.setText("ประเภท: "+getType);

        if(0 <= getScore && getScore <= 3 ){
            geteval.setText("ความเสี่ยง: ไม่ต้องให้การบำบัด");
        }else if(4 <= getScore && getScore <= 26){
            geteval.setText("ความเสี่ยง: ให้การบำบัดอย่างย่อ");
        }else if(getScore >= 27){
            geteval.setText("ความเสี่ยง: ให้การรักษาอย่างเข้มข้น");
        }

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnputresult:
                Intent i = new Intent(EvaluateResult.this,Evaluate.class);
                startActivity(i);
                break;
            case R.id.btncancel:
                Intent i2 = new Intent(EvaluateResult.this,Evaluate.class);
                startActivity(i2);
                break;
        }
    }
}
