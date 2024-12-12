package com.nothcoders.northcodersrestaurant.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class FoodItem {

    int itemImg;
    String itemName;
    String itemDescription;
    double itemPrice;

    public FoodItem(int itemImg, String itemName, String itemDescription, double itemPrice) {
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public FoodItem() {
    }

    //https://developer.android.com/topic/libraries/data-binding/binding-adapters
    @BindingAdapter("android:src") //allow the images in the resource folder to be bound to the UI programmatically from it's resource reference id
    public static void setImageResource(ImageView image, int resource){
        image.setImageResource(resource); //calls a method on the ImageView
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
