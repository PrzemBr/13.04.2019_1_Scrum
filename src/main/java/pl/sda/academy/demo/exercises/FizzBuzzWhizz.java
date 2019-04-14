package pl.sda.academy.demo.exercises;

public class FizzBuzzWhizz {

    public static String fizzBuzzWhizz(Integer digit) {
        if (digit == null) {
            return "Nie dla null!";
        }
        if (digit % 3 == 0 && digit % 5 != 0 && digit != 3) {
            return "Fizz";
        }
        if (digit % 5 == 0 && digit % 3 != 0 && digit != 5) {
            return "Buzz";
        }
        if (digit % 3 == 0 && digit % 5 == 0) {
            return "FizzBuzz";
        }
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

    private static boolean isPrime(Integer n) {
        for(int i=2 ;i<n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

}
