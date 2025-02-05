package mergesort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookPriceSorter sorter = new BookPriceSorter();

        // Input the number of book prices
        System.out.print("Enter the number of book prices: ");
        int numPrices = scanner.nextInt();

        double[] bookPrices = new double[numPrices];

        // Input book prices
        System.out.println("Enter the book prices:");
        for (int i = 0; i < numPrices; i++) {
            System.out.print("Price " + (i + 1) + ": ");
            bookPrices[i] = scanner.nextDouble();
        }

        // Sort and display book prices
        System.out.println("Sorting book prices using Merge Sort...");
        sorter.mergeSort(bookPrices, 0, numPrices - 1);

        System.out.println("Sorted book prices:");
        sorter.displayBookPrices(bookPrices);

        scanner.close();
    }
}
