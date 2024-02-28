package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button andButton;
       andButton=findViewById(R.id.andButton);
       andButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent android;
               android=new Intent(SecondActivity.this,ThirdActivity.class);
               startActivity(android);
           }
       });

       Button wdButton;
       wdButton=findViewById(R.id.wdButton);
       wdButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent WD;
               WD=new Intent(SecondActivity.this, web_Development.class);
               startActivity(WD);
           }
       });

       Button mlButton;
       mlButton=findViewById(R.id.mlButton);
       mlButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent AIML;
               AIML=new Intent(SecondActivity.this, ai_ML.class);
               startActivity(AIML);
           }
       });

       Button hlgButton;
       hlgButton=findViewById(R.id.hkgButton);
       hlgButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent Hacking;
               Hacking=new Intent(SecondActivity.this, HachingActivity.class);
               startActivity(Hacking);
           }
       });

       Button bckButton;
       bckButton=findViewById(R.id.bckButton);
       bckButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent BACK;
               BACK=new Intent(SecondActivity.this, MainActivity.class);
               startActivity(BACK);
           }
       });

    }
}