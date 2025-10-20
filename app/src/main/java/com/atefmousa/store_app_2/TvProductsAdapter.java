package com.atefmousa.store_app_2;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TvProductsAdapter extends RecyclerView.Adapter<TvProductsAdapter.TvViewHolder> {

    private TvClass [] tv_products ;

    public TvProductsAdapter(TvClass[] tv_products) {
        this.tv_products = tv_products;
    }

    @NonNull
    @Override
    public TvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_tv_design,parent,false);

        return new TvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TvViewHolder holder, int position) {
        holder.bind(tv_products[position]);
        int pos = holder.getBindingAdapterPosition();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setTitle(tv_products[pos].getName());
                builder.setMessage(tv_products[pos].getDescription());
                builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
                builder.show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return tv_products.length;
    }


    static class TvViewHolder extends RecyclerView.ViewHolder {

        ImageView image ;
        TextView name ;
        TextView price ;



        public TvViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.tvImage);
            name = itemView.findViewById(R.id.tvName);
            price = itemView.findViewById(R.id.tvPrice);
        }

        public void bind(TvClass tvClass){
            image.setImageResource(tvClass.getImage_id());
            name.setText(tvClass.getName());
            price.setText(String.valueOf(tvClass.getPrice()));

        }
    }

}
