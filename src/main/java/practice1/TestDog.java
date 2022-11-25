package practice1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", 2);
        Dog dog2 = new Dog("Mike");
        Dog dog3 = new Dog();

        dog2.setAge(3);
        System.out.println(dog2.toString());
        dog2.intoHumanAge();
        dog1.intoHumanAge();
        dog3.intoHumanAge();
    }
}
