package com.atefmousa.store_app_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TvProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tv_products);

        TvClass [] tv_products = {
                new TvClass("tv1",800 , "this is tv1",R.drawable.tv1),
                new TvClass("tv2",900 , "this is tv2",R.drawable.tv2),
                new TvClass("tv3",1000 , "this is tv3",R.drawable.tv3),
                new TvClass("tv3",1000 , "this is tv3",R.drawable.tv3),
                new TvClass("tv3",1000 , "this is tv3",R.drawable.tv3)
        };

        RecyclerView recyclerView = findViewById(R.id.recylcerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TvProductsAdapter(tv_products));


    }
}