package com.example.SeaWay;

import java.util.ArrayList;

public class Route
{
    private String type;
    private String title;
    private ArrayList<Float[]> coordinates;

    public Route(String type, String title, ArrayList<Float[]> coordinates) {
        this.type = type;
        this.title = title;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Float[]> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Float[]> coordinates) {
        this.coordinates = coordinates;
    }
}
