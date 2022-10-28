package practice12_15.task1;

public class Person {
    private String name;
    private String lastName;
    private String patronymic;

    public Person(String name, String lastName, String patronymic) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public StringBuilder getInitial(String part) {
        if (part.length() != 0) {
            return new StringBuilder().append(part.charAt(0)).append(".");
        }
        return new StringBuilder("");
    }

    public String getPersonData() {
        StringBuilder data = new StringBuilder();
        data.append(lastName);

        if (name.length() != 0 || patronymic.length() != 0) {
            data.append(" ");
        }
        data.append(getInitial(name));
        data.append(getInitial(patronymic));

        return data.toString();
    }
}
