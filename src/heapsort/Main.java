package heapsort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JobApplicantSalarySorter sorter = new JobApplicantSalarySorter();

        // Input the number of salary demands
        System.out.print("Enter the number of job applicants: ");
        int numApplicants = scanner.nextInt();

        int[] salaries = new int[numApplicants];

        // Input salary demands
        System.out.println("Enter the expected salaries:");
        for (int i = 0; i < numApplicants; i++) {
            System.out.print("Salary " + (i + 1) + ": ");
            salaries[i] = scanner.nextInt();
        }

        // Sort and display salaries
        System.out.println("Sorting salaries using Heap Sort...");
        sorter.heapSort(salaries);

        System.out.println("Sorted salaries:");
        sorter.displaySalaries(salaries);

        scanner.close();
    }
}
