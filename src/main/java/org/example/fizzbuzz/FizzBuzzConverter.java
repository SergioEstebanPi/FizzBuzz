package org.example.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int toConvert) {
        String result = "";
        if (toConvert % 3 == 0) result += "Fizz";
        if (toConvert % 5 == 0) result += "Buzz";
        return (!result.isEmpty()) ? result : String.valueOf(toConvert);
    }
}
