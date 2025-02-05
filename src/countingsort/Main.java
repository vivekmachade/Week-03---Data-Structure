package countingsort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentAgeSorter sorter = new StudentAgeSorter();

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] ages = new int[numStudents];

        // Input student ages
        System.out.println("Enter the ages of the students (between 10 and 18):");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Sort the ages
        System.out.println("Sorting ages using Counting Sort...");
        sorter.countingSort(ages, 10, 18);

        // Display sorted ages
        System.out.println("Sorted ages:");
        sorter.displayAges(ages);

        scanner.close();
    }
}
