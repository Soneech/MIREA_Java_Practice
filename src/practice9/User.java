package practice9;

import java.util.Objects;

public class User {
    private String name;
    private long inn;

    public User(String name, long inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getInn() {
        return inn;
    }

    public void setInn(long inn) {
        this.inn = inn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;

        return inn == user.inn && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inn);
    }
}
