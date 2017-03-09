package com.example.akshayjindam.menubar.recyclerView;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class skillsModel {

    private  String Name;
    public int photoID;


    public skillsModel(){
        String Name = null;
        int photoID = 0;


        this.Name=Name;
        this.photoID=photoID;
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
}
