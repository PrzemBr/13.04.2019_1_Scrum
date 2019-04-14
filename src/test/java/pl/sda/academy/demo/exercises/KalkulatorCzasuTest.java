package pl.sda.academy.demo.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class KalkulatorCzasuTest {

    @Test
    public void shouldAddTime() {
        String startTime = "08:42";
        String endTime = "16:20";
        String breakTime = "00:30";

        String result = KalkulatorCzasu.licz(startTime, endTime, breakTime);

        assertEquals(result, "07:08");
    }

}