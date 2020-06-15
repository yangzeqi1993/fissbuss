package com.thoughtworks;

public class FizzBuss {
    public String fizzBussGame(int number) {

        String string = "";
        String stringContainThree = "";
        String stringContainFive = "";
        String stringContainSeven = "";

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
            stringContainThree =  "fizz";
            string = stringContainThree;
        }

        if (String.valueOf(number).contains("5")) {
            if (number % 5 == 0) {
                stringContainFive += "buss";
            }
            if (number % 7 == 0) {
                stringContainFive += "whizz";
            }
            if (number % 5 != 0 && number % 7 != 0) {
                stringContainFive = Integer.toString(number);
            }
            string = stringContainFive;
        }

        if (String.valueOf(number).contains("7")) {
            if (number % 3 == 0) {
                stringContainSeven += "fizz";
            }
            if (number % 7 == 0) {
                stringContainSeven += "whizz";
            }
            if (number % 3 != 0 && number % 7 != 0) {
                stringContainSeven = Integer.toString(number);
            }
            if (String.valueOf(number).contains("3")) {
                stringContainSeven =  "fizz";
            }
            string = stringContainSeven;
        }

        return string;
    }
}
