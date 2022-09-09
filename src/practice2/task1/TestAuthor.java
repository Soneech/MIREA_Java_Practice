package practice2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan Ivanov", "ivan.ivanov@yandex.ru", 'M');
        System.out.println(author1.getName());
        System.out.println(author1.getEmail());

        Author author2 = new Author("Petr Petrov", "petr.petrov@yandex.ru", 'M');
        System.out.println(author2);

        Author author3 = new Author("Anna Petrova", "anna.petrova@yandex.ru", 'F');
        System.out.println(author3);
    }
}
