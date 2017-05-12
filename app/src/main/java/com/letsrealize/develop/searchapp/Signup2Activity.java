package com.letsrealize.develop.searchapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup2Activity extends AppCompatActivity {

    public Button myButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        myButton = (Button)findViewById(R.id.btn_signup);
        myButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent but1 = new Intent(Signup2Activity.this, CodeSender.class);
                startActivity(but1);
            }
        });

    }
}
