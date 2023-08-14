package org.example.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int toConvert) {
        if (toConvert % 3 == 0) {
            return "Fizz";
        }
        if (toConvert % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(toConvert);
    }
}
