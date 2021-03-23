package com.example.thilina;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerview;
    com.example.thilina.MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new com.example.thilina.MyAdapter(this, getMyList());
        recyclerview.setAdapter(myAdapter);




    }

    private ArrayList<com.example.thilina.Model> getMyList(){

        ArrayList<com.example.thilina.Model> model = new ArrayList<>();

        com.example.thilina.Model m = new com.example.thilina.Model();

        m.setDate("Monday");
        m.setBreakfast("Breakfast");
        m.setLunch("Lunch");
        m.setDinner("Dinner");
        model.add(m);

        m = new com.example.thilina.Model();
        m.setDate("Tuesday");
        m.setBreakfast("Breakfast");
        m.setLunch("Lunch");
        m.setDinner("Dinner");
        model.add(m);

         m = new com.example.thilina.Model();
        m.setDate("Wednesday");
        m.setBreakfast("Breakfast");
        m.setLunch("Lunch");
        m.setDinner("Dinner");
        model.add(m);




        return model;

    }

}