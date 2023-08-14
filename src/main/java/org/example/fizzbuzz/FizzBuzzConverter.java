package org.example.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int toConvert) {
        if (toConvert % 5 == 0 && toConvert % 3 == 0) {
            return "FizzBuzz";
        } else if (toConvert % 3 == 0) {
            return "Fizz";
        } else if (toConvert % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(toConvert);
    }
}
