package practice5.task4;

import java.util.Scanner;

public class Task {
    private static int sum = 0;
    public static int numbersSum(int N) {
        if (N > 0) {
            sum += N % 10;
            numbersSum(N / 10);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();

        int start = (int) Math.pow(10, k - 1);
        int end = (int) (Math.pow(10, k) - 1);
        int result = 0;

        for (int i = start; i <= end; i++) {
            sum = 0;
            if (numbersSum(i) == s) {
                result++;
            }
            System.out.println(i + " " + sum);
        }
        System.out.println(result);
    }
}
