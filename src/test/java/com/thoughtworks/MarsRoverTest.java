package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_location_and_direction_when_init_given_conmands(){
        //Given
        MarsRoverCoordinate initCoordinate = new MarsRoverCoordinate(1,1,"E");
        MarsRover marsRover = new MarsRover();

        //When
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(initCoordinate);

        //Then
        assertThat(coordinate.getLocalX(), is(1));
        assertThat(coordinate.getLocalY(), is(1));
        assertThat(coordinate.getDirection(), is("E"));
    }

    @Test
    public void should_positionY_add_1_when_move_given_direction_is_E(){
        //Given
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"E");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        coordinate = marsRover.move();

        //Then
        assertThat(coordinate.getLocalX(), is(1));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }

    @Test
    public void should_positionY_subtract_1_when_move_given_direction_is_S(){
        //Given
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"S");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        coordinate = marsRover.move();

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(-1));
        assertThat(coordinate.getDirection(), is("S"));
    }

    @Test
    public void should_positionX_subtract_1_when_move_given_direction_is_W(){
        //Given
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"W");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        coordinate = marsRover.move();

        //Then
        assertThat(coordinate.getLocalX(), is(-1));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("W"));
    }

    @Test
    public void should_positionY_add_1_when_move_given_direction_is_N(){
        //Given
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"N");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate initCoordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        MarsRoverCoordinate coordinate = marsRover.move();

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(1));
        assertThat(coordinate.getDirection(), is("N"));
    }

    @Test
    public void should_direction_E_when_rightTurn_given_direction_is_N(){
        //Given
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"N");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        coordinate = marsRover.rightTurn();

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }

    @Test
    public void should_direction_E_when_leftTurn_given_direction_is_S(){
        //Given
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"S");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        coordinate = marsRover.leftTurn();

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("E"));
    }

    @Test
    public void should_direction_N_when_turn_given_direction_is_E_and_turnDirection_is_L(){
        //Given
        String turnDirection = "L";
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"E");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        coordinate = marsRover.turn(turnDirection);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("N"));
    }

    @Test
    public void should_direction_N_when_turn_given_direction_is_W_and_turnDirection_is_R(){
        //Given
        String turnDirection = "R";
        MarsRoverCoordinate currentCoordinate = new MarsRoverCoordinate(0,0,"W");
        MarsRover marsRover = new MarsRover();
        MarsRoverCoordinate coordinate = marsRover.initMarsRover(currentCoordinate);

        //When
        coordinate = marsRover.turn(turnDirection);

        //Then
        assertThat(coordinate.getLocalX(), is(0));
        assertThat(coordinate.getLocalY(), is(0));
        assertThat(coordinate.getDirection(), is("N"));
    }
}
