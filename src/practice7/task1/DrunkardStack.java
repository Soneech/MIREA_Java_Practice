package practice7.task1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class DrunkardStack {
    public static void game(Stack<Integer> player1, Stack<Integer> player2) {
        int steps = 0;

        while(!player1.isEmpty() && !player2.isEmpty() && steps <= 106) {
            int card1 = player1.peek();
            int card2 = player2.peek();
            if ((card1 == 0 && card2 == 9) || (card1 > card2 && card2 != 0 && card1 != 9)) {
                player1.add(0, player1.pop());
                player1.add(0, player2.pop());
            }
            else if ((card1 == 9 && card2 == 0) || (card1 < card2)) {
                player2.add(0, player1.pop());
                player2.add(0, player2.pop());
            }
            steps++;
            System.out.println("step: " + steps);
            System.out.println(player1);
            System.out.println(player2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers1 = scanner.nextLine().split(" ");
        String[] numbers2 = scanner.nextLine().split(" ");

        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();

        for (int i = numbers1.length - 1; i >= 0; i--) {
            player1.push(Integer.valueOf(numbers1[i]));
            player2.push(Integer.valueOf(numbers2[i]));
        }
        game(player1, player2);
    }
}
