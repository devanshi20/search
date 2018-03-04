package com.example.atul_.eatit.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.atul_.eatit.Interface.ItemClickListener;
import com.example.atul_.eatit.R;

/**
 * Created by Karan Patel on 17-01-2018.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView food_name,ingText;
    public ImageView food_image,share_image,ing;

    public void setItemClickListener(ItemClickListener itemClickListener) {

        this.itemClickListener = itemClickListener;
    }

    private ItemClickListener itemClickListener;
    public FoodViewHolder(View itemView) {
        super(itemView);
        ing= (ImageView) itemView.findViewById(R.id.ing);
        ingText=(TextView)itemView.findViewById(R.id.ingtext);
        food_name= (TextView)itemView.findViewById(R.id.food_name);
        food_image= (ImageView)itemView.findViewById(R.id.food_image);
        share_image=(ImageView)itemView.findViewById(R.id.btnshare);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(),false);

    }
}
