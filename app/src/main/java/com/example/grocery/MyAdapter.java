package com.example.grocery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<com.example.grocery.MyHolder> {

    Context c;
    ArrayList<Model> model;
    ImageView icheck;
    boolean isSelected= false;


    public MyAdapter(Context c, ArrayList<Model> model) {
        this.c = c;
        this.model = model;
    }

    @NonNull
    @Override
    public com.example.grocery.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);

        return new com.example.grocery.MyHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull com.example.grocery.MyHolder holder, int position) {

        holder.item.setText(model.get(position).getItem());
        holder.days.setText(model.get(position).getDays());





        holder.mview.setOnLongClickListener( new View.OnLongClickListener(){


            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(c,
                        "You have click long"+model.get(position).getItem(),Toast.LENGTH_LONG).show();
                return false;
            }
        });


}












    @Override
    public int getItemCount() {
        return model.size();
    }
}
