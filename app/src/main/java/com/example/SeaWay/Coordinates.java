package com.example.SeaWay;

import java.util.List;

public class Coordinates {
    private String type;
    private String title;
    private List<Double> coordinate;

    public Coordinates(String title, List<Double> coordinate) {
        this.title = title;
        this.coordinate = coordinate;
    }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getTitle(){
        return title;
    }
    public void setTitle()
    {
        this.title = title;
    }
    public List<Double> getCoordinate(){
        return coordinate;
    }
    public void setCoordinate(){
        this.coordinate=coordinate;
    }
}
