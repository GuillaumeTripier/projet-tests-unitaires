public class FizzBuzz {

    private static final String FIZZ = "Fizz";

    private static final String BUZZ = "Buzz";

    public String fizzBuzz(int input) {

        if (isDivisibleBy3(input) && isDivisibleBy5(input))
            return("" + FIZZ + BUZZ);

        if(isDivisibleBy3(input))
            return FIZZ;

        if (isDivisibleBy5(input))
            return BUZZ;

        return "" + input;

    }

    private boolean isDivisibleBy3(int input) {
        return input % 3 == 0;
    }

    private boolean isDivisibleBy5(int input) {
        return input % 5 == 0;
    }

}