package pl.sda.academy.demo.exercises;

import java.util.ArrayList;
import java.util.List;

public class Greetings {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjacielu";
        }

        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return "Z liczbami się nie witam.";
            }
        }

        String[] names = name.split(",");

        if (names.length == 1) {
            if (names[0].toUpperCase().equals(names[0])) {
                return "WITAJ, " + names[0] + "!";
            } else {
                return "Witaj, " + names[0] + "!";
            }
        }


        List<String> normalNames = new ArrayList<>();
        List<String> upperCaseNames = new ArrayList<>();

        for (String nameFromSplit : names) {
            if (nameFromSplit.toUpperCase().equals(nameFromSplit)) {
                upperCaseNames.add(nameFromSplit);
            } else {
                normalNames.add(nameFromSplit);
            }
        }

        String greetingForNormalNames = "";
        String greetingForUpperCaseNames = "";

        if (normalNames.size() > 1) {
            greetingForNormalNames = getGreetingForNormalNames(normalNames);
        }
        if (upperCaseNames.size() > 0) {
            greetingForUpperCaseNames = getGreetingForUpperCaseNames(upperCaseNames);
        }

        return greetingForNormalNames + greetingForUpperCaseNames;

    }

    private String getGreetingForUpperCaseNames(List<String> upperCaseNames) {
        StringBuilder bigGreeting = new StringBuilder(" WITAJ ");
        for (int i = 0; i < upperCaseNames.size(); i++) {
            bigGreeting.append(upperCaseNames.get(i));
        }
        bigGreeting.append("!");
        return bigGreeting.toString();
    }

    private String getGreetingForNormalNames(List<String> names) {
        StringBuilder greeting = new StringBuilder(names.get(0));
        for (int i = 1; i < names.size() - 1; i++) {
            greeting.append(", ").append(names.get(i));
        }
        greeting.append(" i ").append(names.get(names.size() - 1)).append(", witajcie!");
        return greeting.toString();
    }
}
