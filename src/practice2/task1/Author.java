package practice2.task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        if (gender == 'M')
            return name + "(m) at " + email;
        else if (gender == 'F')
            return name + "(ms) at " + email;
        return name + "(" + gender + ") at " + email;
    }
}
