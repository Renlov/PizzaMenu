package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CardResource> arrayList = new ArrayList<>();
        arrayList.add(new CardResource(R.drawable.cheese_liker, "Любитель сыра", "Соус Цезарь, увеличенная порция сыра Моцарелла"));
        arrayList.add(new CardResource(R.drawable.four_cheese, "4 сыра", "Томатный соус, в два раза больше сыра Моцарелла, Пармезана, Чеддера и сыра Блю, прованские травы"));
        arrayList.add(new CardResource(R.drawable.margarita, "Маргарита", "Томатный соус, в два раза больше нежного сыра Моцарелла, томаты черри, специи «Томаты и оливки»"));
        arrayList.add(new CardResource(R.drawable.cheese_liker, "Любитель сыра", "Соус Цезарь, увеличенная порция сыра Моцарелла"));
        arrayList.add(new CardResource(R.drawable.four_cheese, "4 сыра", "Томатный соус, в два раза больше сыра Моцарелла, Пармезана, Чеддера и сыра Блю, прованские травы"));
        arrayList.add(new CardResource(R.drawable.margarita, "Маргарита", "Томатный соус, в два раза больше нежного сыра Моцарелла, томаты черри, специи «Томаты и оливки»"));
        recyclerView = findViewById(R.id.mainCard);
        recyclerView.setHasFixedSize(true);
        adapter = new CardAdapter(arrayList);
        layoutManager =new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);



    }
}