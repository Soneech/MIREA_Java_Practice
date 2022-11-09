package practice17_18.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTask {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String test1 = "abcdefghijklmnopqrstuv18340";
        String test2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher1 = pattern.matcher(test1);
        Matcher matcher2 = pattern.matcher(test2);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
