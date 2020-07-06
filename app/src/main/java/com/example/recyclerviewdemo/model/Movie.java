package com.example.recyclerviewdemo.model;

public class Movie {

    String title, gerne, year;

    public Movie() {
    }

    public Movie(String title, String gerne, String year) {
        this.title = title;
        this.gerne = gerne;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGerne() {
        return gerne;
    }

    public void setGerne(String gerne) {
        this.gerne = gerne;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
