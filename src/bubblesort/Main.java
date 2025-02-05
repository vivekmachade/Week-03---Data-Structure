package bubblesort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSorter sorter = new StudentSorter();

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] marks = new int[numStudents];

        // Input student marks
        System.out.println("Enter the marks of students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Sort and display the marks
        System.out.println("Sorting marks using Bubble Sort...");
        sorter.bubbleSort(marks);

        System.out.println("Sorted marks in ascending order:");
        sorter.displayMarks(marks);

        scanner.close();
    }
}
