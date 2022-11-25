package practice5.task5;

import java.util.Scanner;

public class Task {
    private static int result = 0;

    public static int sum(int N) {
        if (N > 0) {
            result += N % 10;
            sum(N / 10);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(sum(N));
    }
}
