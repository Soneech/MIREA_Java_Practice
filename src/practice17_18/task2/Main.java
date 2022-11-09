package practice17_18.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";

        String test1 = "aE:dC:cA:56:76:54";
        String test2 = "11:23:45:67:89:Az";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(test1);
        Matcher matcher2 = pattern.matcher(test2);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
