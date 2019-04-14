package pl.sda.academy.demo.exercises;

import static org.junit.Assert.*;
import org.junit.Test;

public class KalkulatorTest {

    @Test
    public void shouldReturnZeroForNullOrEmptyString(){
        String nul = null;
        String pusty = "";

        int result1 =  Kalkulator.licz(nul);
        int result2 = Kalkulator.licz(pusty);

        assertEquals(result1, result2);
        assertEquals(result1, 0);

    }

    @Test
    public void shouldAddManyDigits(){
        String test = "3,5";
        String test2 = "2,3,5";

        int result = Kalkulator.licz(test);
        int result2 = Kalkulator.licz(test2);

        assertEquals(result, 8);
        assertEquals(result2, 10);
    }

    @Test
    public void shouldSeparateBySlashAndN(){
        String test = "3\n5,3";

        int result = Kalkulator.licz(test);

        assertEquals(result, 11);
    }

    @Test
    public void shouldAcceptSeparator(){
        String test = "//;\n3;5;7";

        int result = Kalkulator.licz(test);

        assertEquals(result, 15);
    }
}
