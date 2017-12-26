package com.example.akl.tourguideapp;

/**
 * Created by Mohamed Akl on 12/26/2017.
 */

public class Attraction {
    private String name;
    private String location;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int image = NO_IMAGE_PROVIDED;

    Attraction(String name, String location, int image) {
        this.name = name;
        this.location = location;
        this.image = image;
    }

    Attraction(String name, String location) {
        this.name = name;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }
}
