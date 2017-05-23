package com.example.akshayjindam.menubar.skills_rv;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class skillsModel {

    private String Name;
    public int photoID;
    public float rating;

    public skillsModel() {
    }

    public skillsModel(String name, int photoID, float rating) {
        Name = name;
        this.photoID = photoID;
        this.rating = rating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
