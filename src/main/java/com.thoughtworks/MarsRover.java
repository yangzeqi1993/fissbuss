package com.thoughtworks;

public class MarsRover {

    public MarsRoverCoordinate marsRoverCoordinate;

    public MarsRoverCoordinate initMarsRover(MarsRoverCoordinate marsRoverCoordinate){
        return this.marsRoverCoordinate = marsRoverCoordinate;
    }

    public MarsRoverCoordinate MarsRoverCommand(String commandStr){
        char[] commandCharArray=commandStr.toCharArray();
        for(char command:commandCharArray){
            if ("N".equals(String.valueOf(command))){
                if(this.judgeNextMoveBoundary()){
                    break;
                }
                this.marsRoverCoordinate = this.move();
            }else if("L".equals(String.valueOf(command)) || "R".equals(String.valueOf(command))){
                this.marsRoverCoordinate = this.turn(String.valueOf(command));
            }
        }
        return this.marsRoverCoordinate;
    }

    public MarsRoverCoordinate move(){
        int moveStep = 1;
        String currentDirection = this.marsRoverCoordinate.getDirection();
        switch (currentDirection){
            case "N":
                this.marsRoverCoordinate.setLocalY(marsRoverCoordinate.getLocalY()+moveStep);
                break;
            case "E":
                this.marsRoverCoordinate.setLocalX(marsRoverCoordinate.getLocalX()+moveStep);
                break;
            case "S":
                this.marsRoverCoordinate.setLocalY(marsRoverCoordinate.getLocalY()-moveStep);
                break;
            case "W":
                this.marsRoverCoordinate.setLocalX(marsRoverCoordinate.getLocalX()-moveStep);
                break;
        }
        return marsRoverCoordinate;
    }

    public MarsRoverCoordinate turn(String turnDirection){
        switch (turnDirection) {
            case "L":
                this.marsRoverCoordinate = this.leftTurn();
                break;
            case "R":
                this.marsRoverCoordinate = this.rightTurn();
                break;
        }
        return this.marsRoverCoordinate;
    }

    public MarsRoverCoordinate leftTurn() {
        String currentDirection = this.marsRoverCoordinate.getDirection();
        switch (currentDirection) {
            case "N":
                this.marsRoverCoordinate.setDirection("W");
                break;
            case "E":
                this.marsRoverCoordinate.setDirection("N");
                break;
            case "S":
                this.marsRoverCoordinate.setDirection("E");
                break;
            case "W":
                this.marsRoverCoordinate.setDirection("S");
                break;
        }
        return this.marsRoverCoordinate;
    }

    public MarsRoverCoordinate rightTurn(){
        String currentDirection = this.marsRoverCoordinate.getDirection();
        switch (currentDirection) {
            case "N":
                this.marsRoverCoordinate.setDirection("E");
                break;
            case "E":
                this.marsRoverCoordinate.setDirection("S");
                break;
            case "S":
                this.marsRoverCoordinate.setDirection("W");
                break;
            case "W":
                this.marsRoverCoordinate.setDirection("N");
                break;
        }
        return this.marsRoverCoordinate;
    }

    public boolean judgeNextMoveBoundary(){
        int upBoundaryX = 5;
        int downBoundaryX = -5;
        int upBoundaryY = 5;
        int downBoundaryY = -5;
        boolean moveBeyondUpBoundaryX = (this.marsRoverCoordinate.getLocalX() == upBoundaryX && "E".equals(this.marsRoverCoordinate.getDirection()));
        boolean moveBeyondDownBoundaryX = (this.marsRoverCoordinate.getLocalX() == downBoundaryX && "W".equals(this.marsRoverCoordinate.getDirection()));
        boolean moveBeyondUpBoundaryY = (this.marsRoverCoordinate.getLocalY() == upBoundaryY && "N".equals(this.marsRoverCoordinate.getDirection()));
        boolean moveBeyondDownBoundaryY = (this.marsRoverCoordinate.getLocalY() == downBoundaryY && "S".equals(this.marsRoverCoordinate.getDirection()));

        return (
                moveBeyondUpBoundaryX
             || moveBeyondDownBoundaryX
             || moveBeyondUpBoundaryY
             || moveBeyondDownBoundaryY
        );
    }

}
