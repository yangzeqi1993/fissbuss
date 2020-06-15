package com.thoughtworks;

public class MarsRoverCoordinate {
    private int localX = 0;
    private int localY = 0;
    private String direction= "N";

    public int getLocalX() {
        return localX;
    }

    public void setLocalX(int localX) {
        this.localX = localX;
    }

    public int getLocalY() {
        return localY;
    }

    public void setLocalY(int localY) {
        this.localY = localY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
