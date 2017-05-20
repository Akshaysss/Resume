package com.example.akshayjindam.menubar.experience_rv;

/**
 * Created by Akshay Jindam on 28-02-2017.
 */

public class experienceModel {

    private String CompanyName, Designation, Content1, Content2,Content3;
    private int Period;
    private int photoID1;


    public experienceModel() {
        String CompanyName = null;
        String Designation = null;
        String Content1 = null;
        String Content2 = null;
        String Content3 = null;
        int Period = 0;
        int photoID1 = 0;

        this.CompanyName = CompanyName;
        this.Designation = Designation;
        this.Content1 = Content1;
        this.Content2 = Content2;
        this.Content3 = Content3;
        this.Period = Period;
        this.photoID1 = photoID1;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int period) {
        Period = period;
    }

    public int getPhotoID1() {
        return photoID1;
    }

    public void setPhotoID1(int photoID1) {
        this.photoID1 = photoID1;
    }

    public String getContent1() {
        return Content1;
    }

    public void setContent1(String content1) {
        Content1 = content1;
    }

    public String getContent2() {
        return Content2;
    }

    public void setContent2(String content2) {
        Content2 = content2;
    }

    public String getContent3() {
        return Content3;
    }

    public void setContent3(String content3) {
        Content3 = content3;
    }
}
