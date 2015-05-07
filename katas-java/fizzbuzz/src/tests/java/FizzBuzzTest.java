import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void process_When1_Returns1() throws Exception {
        // arrange (given)
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";

        // act (when)
        String actual = fizzBuzz.process(1);

        // assert (then)
        assertThat(expected, is(equalTo(actual)));
    }
}