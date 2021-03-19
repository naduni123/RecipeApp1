package com.example.nadu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextInputLayout tx;
    AutoCompleteTextView ac;

    ArrayList<String> array_season;
    ArrayAdapter<String> arrayAdapter_season;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





            tx = (TextInputLayout)findViewById(R.id.tx);
            ac = (AutoCompleteTextView)findViewById(R.id.text);

            array_season = new ArrayList<>();
            array_season.add("aaaa");
            array_season.add("aaaa");
            array_season.add("aaaa");
            array_season.add("aaaa");
            array_season.add("aaaa");

            arrayAdapter_season = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item  ,array_season);
            ac.setAdapter(arrayAdapter_season);

            ac.setThreshold(1);



        }
    }
