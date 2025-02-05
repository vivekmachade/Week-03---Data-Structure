package quicksort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductPriceSorter sorter = new ProductPriceSorter();

        // Input the number of product prices
        System.out.print("Enter the number of product prices: ");
        int numPrices = scanner.nextInt();

        double[] productPrices = new double[numPrices];

        // Input product prices
        System.out.println("Enter the product prices:");
        for (int i = 0; i < numPrices; i++) {
            System.out.print("Price " + (i + 1) + ": ");
            productPrices[i] = scanner.nextDouble();
        }

        // Sort and display product prices
        System.out.println("Sorting product prices using Quick Sort...");
        sorter.quickSort(productPrices, 0, numPrices - 1);

        System.out.println("Sorted product prices:");
        sorter.displayProductPrices(productPrices);

      
    }
}
