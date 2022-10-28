package com.example.NewsAppMain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<InitilizationsMod> ModArrayList;

    public Adapter(Context context, ArrayList<InitilizationsMod> modArrayList) {
        this.context = context;
        this.ModArrayList = modArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,webView.class);
                intent.putExtra("url",ModArrayList.get(holder.getAdapterPosition()).getUrl());
                context.startActivity(intent);
            }
        });

        holder.headline.setText(ModArrayList.get(position).getTitle());
        holder.description.setText(ModArrayList.get(position).getDescription());
        Glide.with(context).load(ModArrayList.get(position).getUrlToImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        ModArrayList = new ArrayList<InitilizationsMod>();
        return ModArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        CardView cardView;
        TextView headline,description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            headline = itemView.findViewById(R.id.mainheading);
            description = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }
}
