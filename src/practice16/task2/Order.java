package practice16.task2;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }

    public Order(ArrayList<Item> orderItems) {
        this.orderItems = orderItems;
    }

    public void addItem(Item item) {
        orderItems.add(item);
    }

    public void removeItem(Item item) {
        orderItems.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < orderItems.size(); i++) {
            result.append(String.format("Item %d\n", i + 1));
            result.append(orderItems.get(i).toString());
            result.append('\n');
        }
        return result.toString();
    }
}
