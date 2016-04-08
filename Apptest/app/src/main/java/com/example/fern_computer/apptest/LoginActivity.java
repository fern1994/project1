package com.example.fern_computer.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.login);
        username = (EditText)findViewById(R.id.Username);
        password = (EditText)findViewById(R.id.Password);

        login.setOnClickListener(this);
        username.getText();
        password.getText();

    }

    public void clear(){
        username.setText("");
        password.setText("");
    }

    @Override
    public void onClick(View v) {
        clear();
        Intent i = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(i);


    }
}
