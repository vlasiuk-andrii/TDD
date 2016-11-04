// https://github.com/garora/TDD-Katas

public class FizzBuzz {
    public String convert(int n) {
        if (isDividorOfThreeAndFive(n))
            return "FizzBuzz";
        else if (isDevidorOfThree(n))
            return "Fizz";
        else if (isDevidorOfFive(n))
            return "Buzz";
        else return Integer.toString(n);
    }

    private boolean isDevidorOfFive(int n) {
        return n % 5 == 0;
    }

    private boolean isDevidorOfThree(int n) {
        return n % 3 == 0;
    }

    private boolean isDividorOfThreeAndFive(int n) {
        return isDevidorOfThree(n) & isDevidorOfFive(n);
    }
}
