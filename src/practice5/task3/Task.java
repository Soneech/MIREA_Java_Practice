package practice5.task3;

public class Task {
    public void print(int A, int B) {
        if (A < B) {
            System.out.print(A + " ");
            print(A + 1, B);
        }
        else if (A > B) {
            System.out.print(A + " ");
            print(A - 1, B);
        }
        else {
            System.out.print(B);
            return;
        }

    }
}
