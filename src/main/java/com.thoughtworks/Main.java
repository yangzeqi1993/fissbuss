package com.thoughtworks;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate initCoordinate = new MarsRoverCoordinate(0,0,"N");
        String command = "NLNNRLLLNNNNNNNNRLLRNN";
        marsRover.initMarsRover(initCoordinate);

        //初始位置
        System.out.println("--------初始位置--------");
        System.out.println(marsRover.marsRoverCoordinate.getLocalX());
        System.out.println(marsRover.marsRoverCoordinate.getLocalY());
        System.out.println(marsRover.marsRoverCoordinate.getDirection());

        marsRover.MarsRoverCommand(command);

        //执行命令后的位置
        System.out.println("-------执行命令后的位置-------");
        System.out.println(marsRover.marsRoverCoordinate.getLocalX());
        System.out.println(marsRover.marsRoverCoordinate.getLocalY());
        System.out.println(marsRover.marsRoverCoordinate.getDirection());
    }
}
