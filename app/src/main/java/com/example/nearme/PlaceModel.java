package com.example.nearme;

public class PlaceModel {
    int id, drawableID;
    String name;
    String placeType;

    public PlaceModel() {
    }

    public PlaceModel(int id, int drawableID, String name, String placeType) {
        this.id = id;
        this.drawableID = drawableID;
        this.name = name;
        this.placeType = placeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrawableID() {
        return drawableID;
    }

    public void setDrawableID(int drawableID) {
        this.drawableID = drawableID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }
}
