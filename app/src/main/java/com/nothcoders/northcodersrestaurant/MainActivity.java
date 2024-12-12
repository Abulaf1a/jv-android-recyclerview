package com.nothcoders.northcodersrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.nothcoders.northcodersrestaurant.model.FoodItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FoodItem food = new FoodItem();


    }
}