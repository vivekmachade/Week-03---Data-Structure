package insertionsort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeSorter sorter = new EmployeeSorter();

        // Input number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        int[] employeeIds = new int[numEmployees];

        // Input employee IDs
        System.out.println("Enter the employee IDs:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            employeeIds[i] = scanner.nextInt();
        }

        // Sort and display employee IDs
        System.out.println("Sorting Employee IDs using Insertion Sort...");
        sorter.insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs:");
        sorter.displayEmployeeIds(employeeIds);

        scanner.close();
    }
}
