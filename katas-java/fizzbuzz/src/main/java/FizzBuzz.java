public class FizzBuzz {

    public static final int FIZZ_DIVISOR = 3;
    public static final int BUZZ_DIVISOR = 5;

    public String process(int number) {
        StringBuilder builder = new StringBuilder();

        if (isDivisibleBy(number, FIZZ_DIVISOR))
            builder.append("Fizz");

        if (isDivisibleBy(number, BUZZ_DIVISOR))
            builder.append("Buzz");

        return builder.toString().isEmpty()
            ? String.valueOf(number)
            : builder.toString();
}

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }


}
