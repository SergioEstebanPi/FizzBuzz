import org.example.fizzbuzz.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void leaveNormalNumbersAlone(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzzConverter.convert(1));
        Assert.assertEquals("2", fizzBuzzConverter.convert(2));
    }

    @Test
    public void getMultiplesOfThree(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(3));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(6));
    }

    @Test
    public void getMultiplesOfFive(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(5));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(10));
    }
}
