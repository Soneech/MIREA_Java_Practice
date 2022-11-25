package practice19_20.tasks1_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long startTime, endTime, time;
        boolean result;

        Scanner scanner = new Scanner(System.in);
        CarNumbersGenerator generator = new CarNumbersGenerator();

        System.out.println("Введите кол-во генерируемых номеров:");
        int carNumbersCount = scanner.nextInt();

        System.out.println("Сгенерированные номера:");
        ArrayList<String> carNumbers = new ArrayList<>();

        for (int i = 0; i < carNumbersCount; i ++) {
            String num = generator.generateCarNumber();
            System.out.println(num);
            carNumbers.add(num);
        }

        System.out.println("Введите искомый номер:");
        String carNumber = scanner.next();

        System.out.println("Поиск в ArrayList:");
        startTime = System.nanoTime();
        result = carNumbers.contains(carNumber);
        endTime = System.nanoTime();
        System.out.println(searchVerdict(result));
        System.out.println(timeVerdict(startTime, endTime));

        Collections.sort(carNumbers);
        System.out.println("Отсортированный список номеров:");
        for (String num: carNumbers) {
            System.out.println(num);
        }

        System.out.println("Поиск в отсортированном ArrayList:");
        startTime = System.nanoTime();
        int res = Collections.binarySearch(carNumbers, carNumber);
        endTime = System.nanoTime();

        result = (res != -1);
        System.out.println(searchVerdict(result));
        System.out.println(timeVerdict(startTime, endTime));

        HashSet<String> carNumbersSet = new HashSet<>(carNumbers);
        System.out.println("Поиск в HashSet:");
        startTime = System.nanoTime();
        result = carNumbersSet.contains(carNumber);
        endTime = System.nanoTime();
        System.out.println(searchVerdict(result));
        System.out.println(timeVerdict(startTime, endTime));

        TreeSet<String> carNumbersTreeSet = new TreeSet<>(carNumbers);
        System.out.println("Поиск в TreeSet:");
        startTime = System.nanoTime();
        result = carNumbersTreeSet.contains(carNumber);
        endTime = System.nanoTime();
        System.out.println(searchVerdict(result));
        System.out.println(timeVerdict(startTime, endTime));
    }

    public static String searchVerdict(boolean result) {
        if (result)
            return "найден";
        return "не найден";
    }

    public static String timeVerdict(long startTime, long endTime) {
        return "время: " + (endTime - startTime) + "нс";
    }
}
