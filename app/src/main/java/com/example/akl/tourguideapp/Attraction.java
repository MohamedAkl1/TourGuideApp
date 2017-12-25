package com.example.akl.tourguideapp;

import android.media.Image;

/**
 * Created by Mohamed Akl on 12/26/2017.
 */

public class Attraction {
    String name;
    String location;
    private static final int NO_IMAGE_PROVIDED = -1;
    int image = NO_IMAGE_PROVIDED;

    public Attraction(String name, String location, int image) {
        this.name = name;
        this.location = location;
        this.image = image;
    }

    public Attraction(String name, String location) {
        this.name = name;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }
}
