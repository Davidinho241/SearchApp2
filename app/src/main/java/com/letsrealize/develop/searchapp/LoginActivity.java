package com.letsrealize.develop.searchapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    public Button myButton;
    public Button myButton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myButton = (Button)findViewById(R.id.btn_login);
        myButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but1 = new Intent(LoginActivity.this, Navigation_Activity.class);
                startActivity(but1);
            }
        });

        myButton1 = (Button)findViewById(R.id.btn_Registed);
        myButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but1 = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(but1);
            }
        });
    }
}