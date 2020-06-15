package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBussTest {
    @Test
    public void should_return_1_when_fizzbuzss_then_1(){
        //Give
        int number = 1;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("1"));
    }
}
