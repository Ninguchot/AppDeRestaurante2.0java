package com.example.food20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.food20.adapter.FoodAdapter;
import com.example.food20.databinding.ActivityMainBinding;
import com.example.food20.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(this, foodList);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();
    }
    private void getFood(){

        Food food1 = new Food(
                R.drawable.food1,
                "Best seler food 1",
                "Pedaços de Frango e batata frita",
                "$ 60.00"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "Barca completa",
                "Hot roll e etc",
                "$ 120.00"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "Mistureba",
                "Custelas com Pizza e camarão",
                "$ 300.00"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "Prato da casa branca",
                "Arroz,batata frita e file de frango",
                "$ 50.00"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "Macarrão",
                "Macarrão xique",
                "$ 75.00"
        );
        foodList.add(food5);
    }
}