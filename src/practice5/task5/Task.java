package practice5.task5;

public class Task {
    private int result = 0;

    public int sum(int N) {
        if (N > 0) {
            result += N % 10;
            sum(N / 10);
        }
        return result;
    }
}
