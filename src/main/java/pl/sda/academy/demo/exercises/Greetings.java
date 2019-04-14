package pl.sda.academy.demo.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greetings {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else {
            String greeting = getGreetingForManyNames(name);
            if (greeting != null) {
                return greeting;
            }

            return getGreetingForOneName(name);
        }
    }

    private String getGreetingForOneName(String name) {
        if (name.toUpperCase().equals(name)) {
            return "WITAJ, " + name + "!";
        } else {
            return "Witaj, " + name + "!";
        }
    }

    private String getGreetingForManyNames(String name) {
        String[] names = name.split(",");
        int numberOfNames = names.length;
        if (numberOfNames > 1) {
            String greeting = names[0];
            for (int i = 1; i < numberOfNames - 1; i++) {
                greeting = greeting + ", " + names[i];
            }
            greeting = greeting + " i " + names[numberOfNames - 1] + ", witajcie!";
            return greeting;
        }
        return null;
    }

    private boolean checkIfUpperCase(String name) {
        if (name.toUpperCase().equals(name)) {
            return true;
        } else {
            return false;
        }
    }
}
