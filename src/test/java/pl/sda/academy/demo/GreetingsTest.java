package pl.sda.academy.demo;

import org.junit.Test;
import pl.sda.academy.demo.exercises.Greetings;

import static org.junit.Assert.*;

public class GreetingsTest {

    @Test
    public void shouldReturnGreetingsForSingleName() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, Adam!", result);
    }

    @Test
    public void shouldReturnGreetingsForNullAsName() {
        Greetings greetings = new Greetings();
        String name = null;

        String result = greetings.greet(name);

        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void shouldReturnGreetingsUpperCaseWhenNameIsUpperCase() {
        Greetings greetings = new Greetings();
        String name = "ADAM";

        String result = greetings.greet(name);

        assertEquals("WITAJ, ADAM!", result);
    }
}