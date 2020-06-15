package com.thoughtworks;

public class FizzBuss {
    public String fizzBussGame(int number){
        if(number%3 == 0 && number%5 != 0){
            return "fizz";
        }
        if(number%5 == 0 && number%3 != 0){
            return "buss";
        }

        if(number%5 == 0 && number%3 == 0){
            return "fizzbuss";
        }
        return String.valueOf(number);
    }
}
