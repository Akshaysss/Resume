package com.example.akshayjindam.menubar.recyclerView2;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class educationModel {

    private String Name;
    private int year;
    private String cls;


    public educationModel(){
        String Name = null;
        int year = 0;
        String cls = null;


        this.Name=Name;
        this.year=year;
        this.cls=cls;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
}
