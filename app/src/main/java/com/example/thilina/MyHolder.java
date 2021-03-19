package com.example.thilina;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder<ItemLongClickListner> extends RecyclerView.ViewHolder {


    TextView item;
    TextView date;
    TextView breakfast;
    TextView lunch;
    TextView dinner;
    ImageView idelete;
    View mview;



    MyHolder(@NonNull View itemView) {
        super(itemView);



        this.date = itemView.findViewById(R.id.text1);
        this.breakfast = itemView.findViewById(R.id.breakfast);
        this.lunch = itemView.findViewById(R.id.lunch);
        this.dinner = itemView.findViewById(R.id.dinner);

       mview = itemView;





    }




}
