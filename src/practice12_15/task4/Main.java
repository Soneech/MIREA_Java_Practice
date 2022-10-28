package practice12_15.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        NumberFormat numberFormat = new NumberFormat();
        System.out.println(numberFormat.numberFormat(number));
    }
}
