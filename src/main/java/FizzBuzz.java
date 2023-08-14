import org.example.fizzbuzz.FizzBuzzConverter;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        for(int i=1; i<=100; i++){
            System.out.println(i + ":" + fizzBuzzConverter.convert(i));
        }
    }
}
