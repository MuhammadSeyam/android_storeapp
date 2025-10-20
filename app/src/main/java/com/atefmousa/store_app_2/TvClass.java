package com.atefmousa.store_app_2;

public class TvClass {
    private String name;
    private double price;
    private String description;
    private int image_id;

    public TvClass(String name, double price, String description, int image_id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image_id = image_id ;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getImage_id() {
        return image_id;
    }


}
