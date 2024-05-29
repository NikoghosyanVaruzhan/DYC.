package com.example.dyc;

public class Place {
    public String name;
    public double latitude;
    public double longitude;
    public String color;

    public Place() {
        // Default constructor required for calls to DataSnapshot.getValue(Place.class)
    }

    public Place(String name, double latitude, double longitude, String color) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.color = color;
    }
}
