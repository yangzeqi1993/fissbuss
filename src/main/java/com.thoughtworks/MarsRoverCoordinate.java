package com.thoughtworks;

public class MarsRoverCoordinate {
    private int localX;
    private int localY;
    private String direction;

    public MarsRoverCoordinate(int localX, int localY, String direction){
        this.localX = localX;
        this.localY = localY;
        this.direction = direction;
    }


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
