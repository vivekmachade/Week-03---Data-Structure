package selectionsort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamScoreSorter sorter = new ExamScoreSorter();

        // Input the number of exam scores
        System.out.print("Enter the number of exam scores: ");
        int numScores = scanner.nextInt();

        int[] examScores = new int[numScores];

        // Input exam scores
        System.out.println("Enter the exam scores:");
        for (int i = 0; i < numScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            examScores[i] = scanner.nextInt();
        }

        // Sort and display exam scores
        System.out.println("Sorting exam scores using Selection Sort...");
        sorter.selectionSort(examScores);

        System.out.println("Sorted exam scores:");
        sorter.displayExamScores(examScores);

    }
}
