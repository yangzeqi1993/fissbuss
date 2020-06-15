package com.thoughtworks;

public class FizzBuss {
    public String fizzBussGame(int number){
        if(number%3 == 0){
            return "fizz";
        }
        return String.valueOf(number);
    }
}
