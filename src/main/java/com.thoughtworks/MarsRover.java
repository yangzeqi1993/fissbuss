package com.thoughtworks;

public class MarsRover {
    MarsRoverCoordinate marsRoverCoordinate = new MarsRoverCoordinate();
//    public MarsRoverCoordinate initMarsRover(String conmands, ){
//        String[] str = conmands.split(",");
//        String x=str[0].split("(")
//        marsRoverCoordinate.setLocalX(str[0].split(,));
//    }

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

    public MarsRoverCoordinate leftTurn(MarsRoverCoordinate marsRoverCoordinate){
        return marsRoverCoordinate;
    }

    public MarsRoverCoordinate rightTurn(MarsRoverCoordinate marsRoverCoordinate){
        return marsRoverCoordinate;
    }
}
