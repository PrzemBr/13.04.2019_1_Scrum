package pl.sda.academy.demo.nawiasy;

public class Nawiasy {

    public static boolean check(String nawiasy) {
        String[] split = nawiasy.split("");

        if (checkEveryIteration(split)) return false;

        return isAllClosed(split);


    }

    private static boolean isAllClosed(String[] split) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("]")) {
                close++;
            } else if (split[i].equals("[")) {
                open++;
            }
        }

        return open == close;
    }

    private static boolean checkEveryIteration(String[] split) {
        for (int i = 0; i < split.length; i++) {
            String[] littleSplit = new String[i + 1];
            for (int j = 0; j < littleSplit.length; j++) {
                littleSplit[j] = split[j];
            }

            boolean isMoreClosed = isMoreClosed(littleSplit);

            if (!isMoreClosed) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMoreClosed(String[] split) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("]")) {
                close++;
            } else if (split[i].equals("[")) {
                open++;
            }
        }

        if (close > open) {
            return false;
        } else return true;
    }
}