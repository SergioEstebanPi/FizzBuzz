import org.example.fizzbuzz.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzzConverter fizzBuzzConverter;
    @Before
    public void setup(){
        fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    public void leaveNormalNumbersAlone(){
        Assert.assertEquals("1", fizzBuzzConverter.convert(1));
        Assert.assertEquals("2", fizzBuzzConverter.convert(2));
    }

    @Test
    public void getMultiplesOfThree(){
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(3));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(6));
    }

    @Test
    public void getMultiplesOfFive(){
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(5));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(10));
    }

    @Test
    public void getMultiplesOfBothThreeAndFive(){
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
    }

    @Test
    public void getMultiplesFrom1To100(){
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
    }
}
