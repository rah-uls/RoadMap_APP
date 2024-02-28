package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ai_ML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_ml);
        Button bckButton;
        bckButton=findViewById(R.id.bckButton);
        bckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BACK;
                BACK=new Intent(ai_ML.this, SecondActivity.class);
                startActivity(BACK);
            }
        });
    }
}