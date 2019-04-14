package pl.sda.academy.demo;

import org.junit.Test;
import pl.sda.academy.demo.exercises.FizzBuzzWhizz;

import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {

    @Test
    public void shouldReturnForNull(){

        String returned = FizzBuzzWhizz.fizzBuzzWhizz(null);

        assertEquals("Nie dla null!", returned);
    }

    @Test
    public void shouldReturnForThree(){
        String returned = FizzBuzzWhizz.fizzBuzzWhizz(6);

        assertEquals("Fizz", returned);
    }

    @Test
    public void shouldReturnForFive(){
        String returned = FizzBuzzWhizz.fizzBuzzWhizz(10);

        assertEquals("Buzz", returned);
    }

    @Test
    public void shouldReturnForFourthExample(){
        String returned = FizzBuzzWhizz.fizzBuzzWhizz(15);

        assertEquals("FizzBuzz", returned);
    }

    @Test
    public void shouldReturnForPrimeNumber(){
        String returned1 = FizzBuzzWhizz.fizzBuzzWhizz(7);
        String returned2 = FizzBuzzWhizz.fizzBuzzWhizz(3);
        String returned3 = FizzBuzzWhizz.fizzBuzzWhizz(5);

        assertEquals("Whizz", returned1);
        assertEquals("FizzWhizz", returned2);
        assertEquals("BuzzWhizz", returned3);

    }
}
