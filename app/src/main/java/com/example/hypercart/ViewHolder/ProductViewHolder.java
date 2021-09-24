package com.example.hypercart.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hypercart.Interface.ItemclickListner;
import com.example.hypercart.R;

//Class created to access all the views in product layout. To access them in home activity.
public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    //Accessing image views and text views in product items layout

    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemclickListner listner;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        //Creating links between items layout and image view and text views
        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtProductName = (TextView) itemView.findViewById(R.id.product_name);
        txtProductDescription = (TextView) itemView.findViewById(R.id.product_description);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_price);

    }

    public void setItemClickListner(ItemclickListner listner) {
        this.listner = listner;
    }

    @Override
    public void onClick(View view) {
        listner.onClick(view, getAdapterPosition(), false);
    }
}
