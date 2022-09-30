package practice5.task3;

import java.util.Scanner;

public class Task {
    public static int print(int A, int B) {
        if (A < B) {
            System.out.print(A + " ");
            return print(A + 1, B);
        }
        else if (A > B) {
            System.out.print(A + " ");
            return print(A - 1, B);
        }
        else {
            System.out.print(B);
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        print(A, B);
    }
}
