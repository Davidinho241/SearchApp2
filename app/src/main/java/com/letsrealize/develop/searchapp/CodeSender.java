package com.letsrealize.develop.searchapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CodeSender extends AppCompatActivity {

    public Button monBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_sender);

        monBtn = (Button) findViewById(R.id.btn_code_next);
        monBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but1 = new Intent(CodeSender.this, FogotPassword.class);
                startActivity(but1);
            }
        });

    }
}
