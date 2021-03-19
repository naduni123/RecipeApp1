package com.example.grocery;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerview;
    com.example.grocery.MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new com.example.grocery.MyAdapter(this, getMyList());
        recyclerview.setAdapter(myAdapter);




    }

    private ArrayList<com.example.grocery.Model> getMyList(){

        ArrayList<com.example.grocery.Model> model = new ArrayList<>();

        com.example.grocery.Model m = new com.example.grocery.Model();
        m.setItem("LIST");
        m.setDays("23");
        model.add(m);

        m = new com.example.grocery.Model();
        m.setItem("LIST");
        m.setDays("23");
        model.add(m);

         m = new com.example.grocery.Model();
        m.setItem("LIST");
        m.setDays("23");
        model.add(m);


       m = new com.example.grocery.Model();
        m.setItem("LIST");
        m.setDays("23");
        model.add(m);

        m = new com.example.grocery.Model();
        m.setItem("LIST");
        m.setDays("23");
        model.add(m);

         m = new com.example.grocery.Model();
        m.setItem("LIST");
        m.setDays("23");
        model.add(m);

       m = new com.example.grocery.Model();
        m.setItem("LIST");
        m.setDays("23");
        model.add(m);

        return model;

    }

}