package com.example.akshayjindam.menubar.education_rv;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class educationModel {

    private String CollegeName,CourseName;
    private int year;

    public educationModel() {
        String CollegeName = null;
        int year = 0;
        String CourseName = null;


        this.CollegeName = CollegeName;
        this.year = year;
        this.CourseName = CourseName;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
