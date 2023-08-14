import org.example.fizzbuzz.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void leaveNormalNumbersAlone(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzzConverter.convert(1));
    }
}
