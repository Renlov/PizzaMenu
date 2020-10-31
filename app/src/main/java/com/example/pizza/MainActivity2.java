package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imageView = (findViewById(R.id.imageView));
        TextView textView1 = (findViewById(R.id.text1));
        TextView textView2 = (findViewById(R.id.text2));
        Intent intent  = getIntent();
        if(intent != null) {
            imageView.setImageResource(intent.getIntExtra("imageResource", 0));
            textView1.setText(intent.getStringExtra("text1"));
            textView2.setText(intent.getStringExtra("text2"));
        }
    }

}