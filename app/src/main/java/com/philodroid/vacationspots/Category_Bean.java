package com.philodroid.vacationspots;

public class Category_Bean {
    private int imageId;
    private String title;
    private int color;

    public Category_Bean(int imageId, String title, int color) {
        this.imageId = imageId;
        this.title = title;
        this.color = color;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public int getColor() {
        return color;
    }
}
