package practice17_18.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTask {


    public static void main(String[] args) {
        String regex = "^\\d+\\.\\d{1,2} (USD|RUR|EUR)";

        String test1 = "23.78 USD";
        String test2 = "22 UDD, 0.002 USD";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(test1);
        Matcher matcher2 = pattern.matcher(test2);
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
