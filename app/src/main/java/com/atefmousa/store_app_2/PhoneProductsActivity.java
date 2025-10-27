package com.atefmousa.store_app_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_products);

        PhoneClass[] phone_products = {
                new PhoneClass("iPhone 15", 1200, "Latest Apple iPhone", R.drawable.phone1),
                new PhoneClass("Samsung S23", 1100, "Flagship from Samsung", R.drawable.phone2),
                new PhoneClass("Huawei P50", 950, "Powerful Huawei Phone", R.drawable.phone3)
        };

        RecyclerView recyclerView = findViewById(R.id.recyclerViewPhone);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PhoneProductsAdapter(phone_products));
    }
}
