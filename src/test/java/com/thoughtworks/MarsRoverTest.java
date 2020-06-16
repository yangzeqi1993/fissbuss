package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_location_and_direction_when_init_given_conmands(){
        //Given
        String conmands = "(0,0)N";

        //When


        //Then

    }

    @Test
    public void should_positionY_add_1_when_move_given_direction_is_E(){
        //Given
        String direction = "E";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(1));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }

    @Test
    public void should_positionY_subtract_1_when_move_given_direction_is_S(){
        //Given
        String direction = "S";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(-1));
        assertThat(coordinate.getDirection(), is("S"));
    }

    @Test
    public void should_positionX_subtract_1_when_move_given_direction_is_W(){
        //Given
        String direction = "W";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(-1));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("W"));
    }

    @Test
    public void should_positionY_add_1_when_move_given_direction_is_N(){
        //Given
        String direction = "N";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.move(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(1));
        assertThat(coordinate.getDirection(), is("N"));
    }

    @Test
    public void should_direction_E_when_right_turn_given_direction_is_N(){
        //Given
        String direction = "N";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.rightTurn(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }

    @Test
    public void should_direction_W_when_left_turn_given_direction_is_N(){
        //Given
        String direction = "N";
        int X = 0;
        int Y = 0;
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate();
        currentCoordinate.setLocalX(X);
        currentCoordinate.setLocalY(Y);
        currentCoordinate.setDirection(direction);
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.leftTurn(currentCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("W"));
    }
}
