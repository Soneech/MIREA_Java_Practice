package practice16.task2;

public class Main {
    public static void main(String[] args) {
        TablesOrderManager tablesOrderManager = new TablesOrderManager();
        Order order = new Order();

        Dish dish = new Dish( 150, "borsch", "tasty soup");
        Dish dish1 = new Dish(160, "pizza", "peperoni");
        Drink drink = new Drink(70, "tea", "black tea");

        order.addItem(dish);
        order.addItem(dish1);
        order.addItem(drink);

        tablesOrderManager.addOrder(order);

        Order order1 = new Order();

        Drink drink1 = new Drink(140, "coffee", "big latte");
        order1.addItem(drink1);

        tablesOrderManager.addOrder(order1);

        System.out.println(tablesOrderManager);
    }
}
