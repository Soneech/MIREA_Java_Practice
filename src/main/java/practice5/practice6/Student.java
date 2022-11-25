package practice5.practice6;

public class Student implements Comparable<Student>{
    private String name;
    private int id;
    private int finalScore;

    public Student() {}

    public Student(String name, int id, int finalScore) {
        this.name = name;
        this.id = id;
        this.finalScore = finalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    @Override
    public String toString() {
        return "Student name: " + name + "; id: " + id + "; final score: " + finalScore;
    }

    @Override
    public int compareTo(Student o) {
        if (id > o.getId()) {
            return 1;
        }
        else if (id == o.getId()) {
            return 0;
        }
        return -1;
    }
}
