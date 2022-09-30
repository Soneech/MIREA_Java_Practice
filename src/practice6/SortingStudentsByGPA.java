package practice6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getFinalScore() > student2.getFinalScore()) {
            return 1;
        }
        else if (student1.getFinalScore() == student2.getFinalScore()) {
            return 0;
        }
        return -1;
    }
}
