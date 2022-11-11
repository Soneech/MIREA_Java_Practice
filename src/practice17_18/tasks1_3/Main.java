package practice17_18.tasks1_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }

    public static boolean check(String regex, String test) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }

    public static void firstTask() {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String test1 = "abcdefghijklmnopqrstuv18340";
        String test2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        System.out.println("Task1");
        System.out.println("test1: " + check(regex, test1));
        System.out.println("test2: " + check(regex, test2));
    }

    public static void secondTask() {
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";

        String test1 = "aE:dC:cA:56:76:54";
        String test2 = "11:23:45:67:89:Az";

        System.out.println("Task2");
        System.out.println("test1: " + check(regex, test1));
        System.out.println("test2: " + check(regex, test2));
    }

    public static void thirdTask() {
        String regex = "^\\d+\\.\\d{1,2} (USD|RUR|EUR)";

        String test1 = "23.78 USD";
        String test2 = "22 UDD, 0.002 USD";

        System.out.println("Task3");
        System.out.println("test1: " + check(regex, test1));
        System.out.println("test2: " + check(regex, test2));
    }
}
