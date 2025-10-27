package com.atefmousa.store_app_2;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneProductsAdapter extends RecyclerView.Adapter<PhoneProductsAdapter.PhoneViewHolder> {

    private PhoneClass[] phone_products;

    public PhoneProductsAdapter(PhoneClass[] phone_products) {
        this.phone_products = phone_products;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_phone_design, parent, false);
        return new PhoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        holder.bind(phone_products[position]);
        int pos = holder.getBindingAdapterPosition();

        holder.itemView.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
            builder.setTitle(phone_products[pos].getName());
            builder.setMessage(phone_products[pos].getDescription());
            builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
            builder.show();
        });
    }

    @Override
    public int getItemCount() {
        return phone_products.length;
    }

    static class PhoneViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        TextView price;

        public PhoneViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.phoneImage);
            name = itemView.findViewById(R.id.phoneName);
            price = itemView.findViewById(R.id.phonePrice);
        }

        public void bind(PhoneClass phoneClass) {
            image.setImageResource(phoneClass.getImage_id());
            name.setText(phoneClass.getName());
            price.setText(String.valueOf(phoneClass.getPrice()));
        }
    }
}
