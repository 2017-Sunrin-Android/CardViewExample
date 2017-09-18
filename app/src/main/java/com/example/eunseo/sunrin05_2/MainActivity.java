package com.example.eunseo.sunrin05_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<FoodItem> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        data.add(new FoodItem(R.drawable.chicken, "치킨"));
        data.add(new FoodItem(R.drawable.pizza, "피자"));
        data.add(new FoodItem(R.drawable.jockbal, "족발"));

        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(),data,R.layout.activity_main));

    }
}
