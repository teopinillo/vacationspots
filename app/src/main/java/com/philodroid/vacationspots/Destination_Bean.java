package com.philodroid.vacationspots;

//Data class used by VacationSpots
public class Destination_Bean {
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    private int imageId;
    private String placeName;

    public Destination_Bean(int imageId, String placeName) {
        this.imageId = imageId;
        this.placeName = placeName;
    }

}
