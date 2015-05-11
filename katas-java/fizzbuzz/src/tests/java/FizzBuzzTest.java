import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void process_NotDivisibleBy3Or5_ReturnsNumber() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected1 = "1";
        String expected2 = "2";
        // assert
        assertThat(fizzBuzz.process(1), is(expected1));
        assertThat(fizzBuzz.process(2), is(expected2));
    }


    @Test
      public void process_DivisibleBy3_ReturnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";

        // assert
        assertThat(fizzBuzz.process(3), is(expected));
        assertThat(fizzBuzz.process(6), is(expected));
    }

    @Test
    public void process_DivisibleBy5_ReturnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";

        // assert
        assertThat(fizzBuzz.process(5), is(expected));
        assertThat(fizzBuzz.process(10), is(expected));
    }

    @Test
    public void process_DivisibleBy3And5_ReturnsFizzBuzz (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";

        // assert
        assertThat(fizzBuzz.process(15), is(expected));
        assertThat(fizzBuzz.process(30), is(expected));
    }
}