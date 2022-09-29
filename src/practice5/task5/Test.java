package practice5.task5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Task task = new Task();
        System.out.println(task.sum(N));
    }
}
