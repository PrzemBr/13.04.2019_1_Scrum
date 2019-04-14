package pl.sda.academy.demo.exercises;

public class FizzBuzzWhizz {

    public static String fizzBuzzWhizz(Integer digit) {
        if (digit == null) {
            return "Nie dla null!";
        }
        return null;
    }

    public static String fizzBuzzWhizzDivisionBy3(Integer digit) {
        if (digit % 3 == 0) {
            return "Fizz";
        }
        return null;
    }

    public static String fizzBuzzWhizzDivisionBy5(Integer digit) {
        if (digit % 5 == 0) {
            return "Buzz";
        }
        return null;
    }

    public static String fizzBuzzWhizzDivisionBy3and5(Integer digit) {
        if (digit % 3 == 0 && digit % 5 == 0) {
            return "FizzBuzz";
        }
        return null;
    }

    private static boolean isPrime(Integer n) {
        for(int i=2 ;i<n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static String fizzBuzzWhizzIfNumberIsPrime(Integer digit) {
        if (isPrime(digit)) {
            if (digit == 3) {
                return "FizzWhizz";
            } else if (digit == 5) {
                return "BuzzWhizz";
            } else {
                return "Whizz";
            }
        }
        return null;
    }
}
