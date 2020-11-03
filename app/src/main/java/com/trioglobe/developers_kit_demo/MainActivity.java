package com.trioglobe.developers_kit_demo;


import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    Button show;
ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.show);
imgview = findViewById(R.id.imgview);
       show.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Glide.with(MainActivity.this).load(R.drawable.gif).placeholder(R.drawable.gif).fitCenter().into(imgview);

           }
       });
    }


}