package com.thoughtworks;

public class FizzBuss {
    public String fizzBussGame(int number){
        if(String.valueOf(number).contains("3")){
            return "fizz";
        }
        if(number%3 == 0){
            if(number%5 == 0){
                if(number%7 == 0){
                    return "fizzbusswhizz";
                }else{
                    return "fizzbuss";
                }
            }else{
                if(number%7 == 0){
                    return "fizzwhizz";
                }
            }
            return "fizz";
        }else if(number%5 == 0){
            if(number%7 == 0){
                return "busswhizz";
            }else{
                return "buss";
            }
        }else if(number%7 == 0){
            return "whizz";
        }
        return String.valueOf(number);
    }
}
