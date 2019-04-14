package pl.sda.academy.demo;

import org.junit.Test;
import pl.sda.academy.demo.nawiasy.Nawiasy;
import static org.junit.Assert.*;

public class NawiasyTest {

    @Test
    public void shouldReturnTrueForFirstExample(){
        String nawiasy = "[]";

        boolean check = Nawiasy.check(nawiasy);

        assertTrue(check);
    }

    @Test
    public void shouldReturnTrueForSecondExample(){
        String nawiasy = "[][]";

        boolean check = Nawiasy.check(nawiasy);

        assertTrue(check);
    }

    @Test
    public void shouldReturnTrueForThirdExample(){
        String nawiasy = "[[][]]";

        boolean check = Nawiasy.check(nawiasy);

        assertTrue(check);
    }

    @Test
    public void shouldReturnFalseForFourthExample(){
        String nawiasy = "][";

        boolean check = Nawiasy.check(nawiasy);

        assertFalse(check);
    }

    @Test
    public void shouldReturnFalseForFifthExample(){
        String nawiasy = "][][";

        boolean check = Nawiasy.check(nawiasy);

        assertFalse(check);
    }

    @Test
    public void shouldReturnFalseForSixthExample(){
        String nawiasy = "[]][[]";

        boolean check = Nawiasy.check(nawiasy);

        assertFalse(check);
    }

}
