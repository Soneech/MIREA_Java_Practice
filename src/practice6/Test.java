package practice6;

import java.util.Scanner;

public class Test {
    private static final SortingStudentsByGPA sorting = new SortingStudentsByGPA();
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1].compareTo(temp) > 0) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    public static void quickSort(Student[] array, int leftBorder, int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        int middle = (leftBorder + rightBorder) / 2;

        do {
            while(sorting.compare(array[left], array[middle]) > 0) {
                left++;
            }
            while(sorting.compare(array[right], array[middle]) < 0) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    Student temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < rightBorder) {
            quickSort(array, left, rightBorder);
        }
        if (leftBorder < right) {
            quickSort(array, leftBorder, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] iDNumber = new Student[5];
        iDNumber[0] = new Student("Ivanov Ivan", 104, 150);
        iDNumber[1] = new Student("Petrov Petr", 101, 125);
        iDNumber[2] = new Student("Ivanova Anna", 100, 150);
        iDNumber[3] = new Student("Petrova Ekaterina", 103, 140);
        iDNumber[4] = new Student("Kulikov Maks", 102, 99);

//        Student[] iDNumber2 = new Student[4];
//        iDNumber[0] = new Student("Ivanova Nastya", 107, 112);
//        iDNumber[1] = new Student("Sidorov Konstantin", 105, 145);
//        iDNumber[2] = new Student("Ivanova Vera", 108, 80);
//        iDNumber[3] = new Student("Koroleva Dasha", 106, 150);
//
//        Student[] allStudents = mergeSort(iDNumber, iDNumber2);

        System.out.println("Введите номер упражнения: ");
        int exNumber = scanner.nextInt();

        switch (exNumber) {
            case 1:
                insertionSort(iDNumber);
                break;
            case 2:
                quickSort(iDNumber, 0, iDNumber.length - 1);
                break;
            default:
                break;
        }

        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}
