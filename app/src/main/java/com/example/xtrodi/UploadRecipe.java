package com.example.xtrodi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class UploadRecipe extends AppCompatActivity {
    TextInputLayout tx;
    AutoCompleteTextView ac;

    ArrayList<String> array_season;
    ArrayAdapter<String> arrayAdapter_season;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_recipe);

        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        TextView txt = findViewById(R.id.text);


        ac = findViewById(R.id.text);
        TextInputLayout tx =findViewById(R.id.tx);
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





