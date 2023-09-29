package com.example.food20.model;

public class Food {
    int imgFood;
    String foodName;
    String foodDescription;
    String price;

    public Food(int imgFood, String foodName, String foodDescription, String price) {
        this.imgFood = imgFood;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.price = price;
    }

    public int getImgFood() {
        return imgFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public String getPrice() {
        return price;
    }

}
