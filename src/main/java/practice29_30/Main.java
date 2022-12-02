package practice29_30;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] words = text.split("[\\p{Punct}\\s+]");

        List<String> result = new ArrayList<>();

        Stream
                .of(words)
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(
                    (elem1, elem2) -> {
                        if (elem1.getValue().equals(elem2.getValue())) {
                            return elem1.getKey().compareTo(elem2.getKey());
                        }
                        return elem1.getValue().compareTo(elem2.getValue());
                    }
                )
                .limit(10)
                .forEach(elem -> result.add(elem.getKey()));

        for (String word: result) {
            System.out.println(word);
        }
    }
}
