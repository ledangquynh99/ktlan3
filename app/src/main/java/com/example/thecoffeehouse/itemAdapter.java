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

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.itemViewholder> {

    Context context119;
    List<item> itemList119;

    public itemAdapter(Context context, List<item> itemList) {
        this.context119 = context;
        this.itemList119 = itemList;
    }

    @NonNull
    @Override
    public itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context119).inflate(R.layout.row_item,parent,false);
        return new itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewholder holder, int position) {
        holder.image.setImageResource(itemList119.get(position).getImage());
        holder.title.setText(itemList119.get(position).getTitle());
        holder.text.setText(itemList119.get(position).getText());
        holder.bt.setText(itemList119.get(position).getBt());
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

    public static final class itemViewholder extends RecyclerView.ViewHolder  {

        ImageView image;
        TextView title,text,bt;

        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title);
            text=itemView.findViewById(R.id.text);
            bt=itemView.findViewById(R.id.button);
        }
    }
}
