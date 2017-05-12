package com.letsrealize.develop.searchapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    public Button myButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        myButton = (Button)findViewById(R.id.btn_next);
        myButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but1 = new Intent(SignupActivity.this, Signup2Activity.class);
                startActivity(but1);
            }
        });

    }
}