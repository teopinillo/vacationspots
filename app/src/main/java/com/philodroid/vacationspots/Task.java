package com.philodroid.vacationspots;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

    private static Task instance = null;
    private ArrayList<Category_Bean> categories;
    private Task(){
    }

    private List<Integer> images = Arrays.asList(
            R.drawable.reservations,
            R.drawable.saved_places,
            R.drawable.getting_around,
            R.drawable.things_to_do,
            R.drawable.things_to_know,
            R.drawable.food_drinks,
            R.drawable.day_plans);

    private List<Integer> intColors = Arrays.asList(
            Color.parseColor("#9675CE"),
            Color.parseColor("#4386F5"),
            Color.parseColor("#479050"),
            Color.parseColor("#EC8232"),
            Color.parseColor("#5AC7DB"),
            Color.parseColor("#52C3FA"),
            Color.parseColor("#F5B432"));

    private List<String> titles = Arrays.asList(
            "Reservations",
            "Saved Places",
            "Getting Around",
            "Things to Do",
            "Things to Know",
            "Food and Drinks",
            "Day Plans");

    public static List<Category_Bean> getCategories() {
        if (instance==null){
           instance = new Task();
            instance.categories = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                instance.categories.add(new Category_Bean(instance.images.get(i), instance.titles.get(i), instance.intColors.get(i)));
            }
        }
        return instance.categories;
    }
}
