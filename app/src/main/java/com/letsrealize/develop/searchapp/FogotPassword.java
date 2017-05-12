package com.letsrealize.develop.searchapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FogotPassword extends AppCompatActivity {

    public Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fogot_password);

        myBtn = (Button) findViewById(R.id.btn_fpassword);
        myBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but1 = new Intent(FogotPassword.this, Navigation_Activity.class);
                startActivity(but1);
            }
        });
    }
}
