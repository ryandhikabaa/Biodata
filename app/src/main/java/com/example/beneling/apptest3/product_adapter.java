package com.example.beneling.apptest3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class product_adapter extends RecyclerView.Adapter<product_adapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<product> productList;

    //getting the context and product list with constructor
    public product_adapter(Context mCtx, List<product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }



    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.activity_cardview, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder( final ProductViewHolder holder, final int position) {
        //getting the product of the specified position
        final product product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.btndetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mCtx.getApplicationContext(), detailbiodata.class);
                intent.putExtra("image",product.getImage());
                intent.putExtra("title",product.getTitle());
                intent.putExtra("shortdesc",product.getShortdesc());
                intent.putExtra("biodatanya",product.getBiodatanya());
//                intent.putExtra(R.string.Ryandhika);
                mCtx.startActivity(intent);
//                intent.putExtra("detail",product.getBiodata());
            }
        });

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc;
        ImageView imageView;
        Button btndetail;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            imageView = itemView.findViewById(R.id.imageView);
            btndetail = itemView.findViewById(R.id.btndetail);

        }
    }
}