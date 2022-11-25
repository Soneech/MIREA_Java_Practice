package practice12_15.task2;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.setData("COUNTRY, REGION, CITY, STREET, HOUSE, PART, FLAT");
        System.out.println(address);

        address.setData("COUNTRY. REGION; CITY; STREET- HOUSE. PART/ FLAT");
        System.out.println(address);
    }
}
