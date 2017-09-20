package com.example.eunseo.sunrin05_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<FoodItem> data = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        data.add(new FoodItem(R.drawable.chicken, "치킨"));
        data.add(new FoodItem(R.drawable.pizza, "피자"));
        data.add(new FoodItem(R.drawable.jockbal, "족발"));

        recyclerView.setAdapter(new RecyclerAdapter(this,data,R.layout.activity_main));
    }

    public void addClicked(View v){
        AlertDialog.Builder input = new AlertDialog.Builder(this);
        final EditText name=new EditText(this);
        name.setHint("음식 이름 입력");
        input.setView(name);
        input.setTitle("음식 추가");
        input.setPositiveButton("ADD", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String foodName=name.getText().toString();
                data.add(new FoodItem(R.mipmap.ic_launcher,foodName));
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        });

        input.setNegativeButton("CANCEL", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog dialog = input.create();
        dialog.show();
    }
}
