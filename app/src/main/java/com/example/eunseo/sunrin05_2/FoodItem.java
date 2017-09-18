package com.example.eunseo.sunrin05_2;

/**
 * Created by eunseo on 2017-09-19.
 */


public class FoodItem {
    private int image;
    private String name;

    public FoodItem(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}