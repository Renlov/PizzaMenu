package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imageView = (findViewById(R.id.imageView));
        Intent intent  = getIntent();
        if(intent != null) {
            imageView.setImageResource(intent.getIntExtra("imageResource", 0));
        }
    }

}