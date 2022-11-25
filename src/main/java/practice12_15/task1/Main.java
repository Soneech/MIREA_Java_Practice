package practice12_15.task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sonya", "Patrina", "Nikolaevna");
        System.out.println(person.getPersonData());

        Person person1 = new Person("", "Ivanov", "Ivanovich");
        System.out.println(person1.getPersonData());

        Person person2 = new Person("Ivan", "Petrov", "");
        System.out.println(person2.getPersonData());

        Person person3 = new Person("", "Sidorov", "");
        System.out.println(person3.getPersonData());
    }
}
