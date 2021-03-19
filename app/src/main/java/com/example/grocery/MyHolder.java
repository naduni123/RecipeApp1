package com.example.grocery;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder<ItemLongClickListner> extends RecyclerView.ViewHolder {


    TextView item;
    TextView days;
    ImageView idelete;
    View mview;



    MyHolder(@NonNull View itemView) {
        super(itemView);


        this.item = itemView.findViewById(R.id.text1);
        this.days = itemView.findViewById(R.id.text2);

       mview = itemView;





    }




}
