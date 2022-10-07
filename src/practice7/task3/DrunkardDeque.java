package practice7.task3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardDeque {
    public static void game(Deque<Integer> player1, Deque<Integer> player2) {
        int steps = 0, card1, card2;
        while (steps < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            card1 = player1.pop();
            card2 = player2.pop();
            if ((card1 == 0 && card2 == 9) || (card1 > card2 && card2 != 0 && card1 != 9)) {
                player1.addLast(card1);
                player1.addLast(card2);
            }
            else if ((card1 == 9 && card2 == 0) || (card1 < card2)) {
                player2.addLast(card1);
                player2.addLast(card2);
            }
            steps++;
//            System.out.println("step: " + steps);
//            System.out.println(player1);
//            System.out.println(player2);
        }

        if (steps != 106) {
            if (player1.isEmpty())
                System.out.println("second " + steps);
            else
                System.out.println("first " + steps);
        }
        else
            System.out.println("botva");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            player1.addLast(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            player2.addLast(scanner.nextInt());
        }

        game(player1, player2);
    }
}
