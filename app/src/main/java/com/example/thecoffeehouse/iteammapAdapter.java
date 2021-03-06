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

public class iteammapAdapter extends RecyclerView.Adapter<iteammapAdapter.itemViewholder> {
    Context context119;
    List<itemmap> itemList119;

    public iteammapAdapter(Context context, List<itemmap> itemList) {
        this.context119 = context;
        this.itemList119 = itemList;
    }

    @NonNull
    @Override
    public iteammapAdapter.itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context119).inflate(R.layout.row_mapiteam,parent,false);
        return new iteammapAdapter.itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull iteammapAdapter.itemViewholder holder, int position) {
        holder.image.setImageResource(itemList119.get(position).getImage());
        holder.title.setText(itemList119.get(position).getNamestore());
        holder.text.setText(itemList119.get(position).getMota());
        holder.x.setText( itemList119.get(position).getX());
        holder.y.setText( itemList119.get(position).getY());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList119.size();
    }

    public static final class itemViewholder extends RecyclerView.ViewHolder  {

        ImageView image;
        TextView title,text;
        TextView x,y;

        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image1);
            title=itemView.findViewById(R.id.title1);
            text=itemView.findViewById(R.id.text1);
            x=itemView.findViewById(R.id.x);
            y=itemView.findViewById(R.id.y);
        }
    }
}

