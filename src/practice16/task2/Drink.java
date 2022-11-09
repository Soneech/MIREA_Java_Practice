package practice16.task2;

public final class Drink implements Item {
    private final int price;
    private final String name;
    private final String description;


    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
    }

    public Drink(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
