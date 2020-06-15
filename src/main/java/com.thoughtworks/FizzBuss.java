package com.thoughtworks;

public class FizzBuss {
    public String fizzBussGame(int number) {

        String string = "";

        if (number % 3 == 0) {
            string += "fizz";
        }
        if (number % 5 == 0) {
            string += "buss";
        }
        if (number % 7 == 0) {
            string += "whizz";
        }
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            string = Integer.toString(number);
        }

        if (String.valueOf(number).contains("3")) {
            if(!String.valueOf(number).contains("5")){
                string =  "fizz";
            }
        }


        return string;
    }
}
