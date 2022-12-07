package com.example.domain;

public class Properties {

    private double mag;
    private String place;
    private long time;
    private String url;

    public Properties(){

    }

    public double getMagnitude() {
        return mag;
    }

    public void setMagnitude(double magnitude) {
        this.mag= mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
