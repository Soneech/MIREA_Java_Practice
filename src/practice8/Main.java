package practice8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        User user = new User("Vanya", 15);

        users.add(user);
        users.add(new User("Anya", 20));
        users.add(new User("Vova", 18));
        users.add(new User("Misha", 19));

        WaitList<User> waitList = new WaitList<>(users);
        System.out.println(waitList);
        waitList.add(new User("Katya", 35));
        System.out.println(waitList);
        System.out.println(waitList.contains(user));
    }
}
