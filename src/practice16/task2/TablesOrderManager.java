package practice16.task2;

import java.util.ArrayList;

public class TablesOrderManager {
    private ArrayList<Order> orders;

    public TablesOrderManager() {
        orders = new ArrayList<>();
    }

    public TablesOrderManager(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public String toString() {
        StringBuilder ordersTable = new StringBuilder();
        for (int i = 0; i < orders.size(); i++) {
            ordersTable.append(String.format("Order %d\n", i + 1));
            ordersTable.append(orders.get(i).toString());
        }
        return ordersTable.toString();
    }
}
