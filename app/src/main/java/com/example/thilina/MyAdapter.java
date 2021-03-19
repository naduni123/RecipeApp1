package com.example.thilina;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

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
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);

        return new MyHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {


        holder.date.setText(model.get(position).getDate());
        holder.breakfast.setText(model.get(position).getBreakfast());

        holder.lunch.setText(model.get(position).getLunch());

        holder.dinner.setText(model.get(position).getDinner());












}












    @Override
    public int getItemCount() {
        return model.size();
    }
}
