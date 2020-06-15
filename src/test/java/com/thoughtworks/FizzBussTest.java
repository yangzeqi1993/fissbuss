package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBussTest {
    @Test
    public void should_return_1_when_fizzbuss_given_1(){
        //Give
        int number = 1;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("1"));
    }

    @Test
    public void should_return_fizz_when_fizzbuss_given_3(){
        //Give
        int number = 3;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizz"));
    }

    @Test
    public void should_return_buss_when_fizzbuss_given_5(){
        //Give
        int number = 5;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("buss"));
    }

    @Test
    public void should_return_whizz_when_fizzbuss_given_7(){
        //Give
        int number = 7;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("whizz"));
    }

    @Test
    public void should_return_buss_when_fizzbuss_given_15(){
        //Give
        int number = 15;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("buss"));
    }

    @Test
    public void should_return_fizzwhizz_when_fizzbuss_given_21(){
        //Give
        int number = 21;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizzwhizz"));
    }


    @Test
    public void should_return_busswhizz_when_fizzbuss_given_105(){
        //Give
        int number = 105;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("busswhizz"));
    }

    @Test
    public void should_return_fizz_when_fizzbuss_given_30(){
        //Give
        int number = 30;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizz"));
    }

    @Test
    public void should_return_busswhizz_when_fizzbuss_given_35(){
        //Give
        int number = 35;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("busswhizz"));
    }

    @Test
    public void should_return_busswhizz_when_fizzbuss_given_75(){
        //Give
        int number = 75;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizz"));
    }

    @Test
    public void should_return_fizz_when_fizzbuss_given_753(){
        //Give
        int number = 753;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizz"));
    }

    @Test
    public void should_return_153_when_fizzbuss_given_153(){
        //Give
        int number = 153;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("153"));
    }

    @Test
    public void should_return_fizz_when_fizzbuss_given_173(){
        //Give
        int number = 173;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizz"));
    }

}
