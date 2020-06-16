package com.thoughtworks;

public class MarsRover {

    public MarsRoverCoordinate initMarsRover(MarsRoverCoordinate marsRoverCoordinate){
        return marsRoverCoordinate;
    }

    public MarsRoverCoordinate move(MarsRoverCoordinate marsRoverCoordinate){
        int moveStep = 1;
        String currentDirection = marsRoverCoordinate.getDirection();
        switch (currentDirection){
            case "N":
                marsRoverCoordinate.setLocalY(marsRoverCoordinate.getLocalY()+moveStep);
                break;
            case "E":
                marsRoverCoordinate.setLocalX(marsRoverCoordinate.getLocalX()+moveStep);
                break;
            case "S":
                marsRoverCoordinate.setLocalY(marsRoverCoordinate.getLocalY()-moveStep);
                break;
            case "W":
                marsRoverCoordinate.setLocalX(marsRoverCoordinate.getLocalX()-moveStep);
                break;
        }
        return marsRoverCoordinate;
    }

    public MarsRoverCoordinate turn(MarsRoverCoordinate marsRoverCoordinate, String turnDirection){
        switch (turnDirection) {
            case "L":
                marsRoverCoordinate = this.leftTurn(marsRoverCoordinate);
                break;
            case "R":
                marsRoverCoordinate = this.rightTurn(marsRoverCoordinate);
                break;
        }
        return marsRoverCoordinate;
    }

    public MarsRoverCoordinate leftTurn(MarsRoverCoordinate marsRoverCoordinate) {
        String currentDirection = marsRoverCoordinate.getDirection();
        switch (currentDirection) {
            case "N":
                marsRoverCoordinate.setDirection("W");
                break;
            case "E":
                marsRoverCoordinate.setDirection("N");
                break;
            case "S":
                marsRoverCoordinate.setDirection("E");
                break;
            case "W":
                marsRoverCoordinate.setDirection("S");
                break;
        }
        return marsRoverCoordinate;
    }

    public MarsRoverCoordinate rightTurn(MarsRoverCoordinate marsRoverCoordinate){
        String currentDirection = marsRoverCoordinate.getDirection();
        switch (currentDirection) {
            case "N":
                marsRoverCoordinate.setDirection("E");
                break;
            case "E":
                marsRoverCoordinate.setDirection("S");
                break;
            case "S":
                marsRoverCoordinate.setDirection("W");
                break;
            case "W":
                marsRoverCoordinate.setDirection("N");
                break;
        }
        return marsRoverCoordinate;
    }

}
