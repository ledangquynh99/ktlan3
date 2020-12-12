package com.example.thecoffeehouse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class orderAdapter extends RecyclerView.Adapter<orderAdapter.orderViewholder>{
        Context context119;
        int row_layout119;
        List<orderItem> itemList119;

        public orderAdapter(Context context, List<orderItem> itemList,int row_layout) {
            this.context119 = context;
            this.itemList119 = itemList;
            this.row_layout119 =row_layout;
        }

    @NonNull
    @Override
    public orderViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView =layoutInflater.inflate(row_layout119,parent,false);
        return new orderViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull orderViewholder holder, int position) {
        holder.image.setImageResource(itemList119.get(position).getImage());
        holder.title.setText(itemList119.get(position).getTitle());
        holder.price.setText(itemList119.get(position).getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context119, MainActivity.class);
                context119.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList119.size();
    }

    public static final class orderViewholder extends RecyclerView.ViewHolder  {

            ImageView image;
            TextView title,price;

            public orderViewholder(@NonNull View itemView) {
                super(itemView);
                image=itemView.findViewById(R.id.image);
                title=itemView.findViewById(R.id.title);
                price=itemView.findViewById(R.id.price);
            }
        }
    }

