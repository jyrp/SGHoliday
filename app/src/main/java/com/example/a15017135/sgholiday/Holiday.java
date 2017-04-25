package com.example.a15017135.sgholiday;


import android.media.Image;
import android.widget.ImageView;

public class Holiday {

    private Integer HolidayImage;
    private String name;
    private String date;

    public Holiday(Integer HolidayImage,String name,String date) {
       this.HolidayImage = HolidayImage;
        this.name = name;
        this.date = date;
    }
    public Integer getImage()  {
        return HolidayImage;
    }{
    }
    public String getName()  {
        return name;
    }{
    }
    public String getDate()  {
        return date;
    }{
    }
}