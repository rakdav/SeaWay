package com.example.SeaWay;

public class Port
{
    private float x;
    private float y;
    private String title;
    private String snippet;

    public Port(float x, float y, String title, String snippet) {
        this.x = x;
        this.y = y;
        this.title = title;
        this.snippet = snippet;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public String getTitle() {
        return title;
    }

    public String getSnippet() {
        return snippet;
    }
}
