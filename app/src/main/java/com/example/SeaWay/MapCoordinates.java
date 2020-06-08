package com.example.SeaWay;

import java.util.List;

public class MapCoordinates
{

    private String title;
    private String type;
    private List<Coordinates> coordinates;
    private List<Port> ports;

    public MapCoordinates(String title, String type, List<Coordinates> coordinates, List<Port> ports) {
        this.title = title;
        this.type = type;
        this.coordinates = coordinates;
        this.ports = ports;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Coordinates> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinates> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }
}
