package bubblesort;

public class StudentSorter {

    // Bubble Sort to sort student marks in ascending order
    public void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap adjacent elements
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // Break if no elements were swapped, list is already sorted
            if (!swapped) break;
        }
    }

    // Method to display sorted marks
    public void displayMarks(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
