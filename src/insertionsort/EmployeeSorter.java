package insertionsort;

public class EmployeeSorter {

    // Insertion Sort to sort employee IDs
    public void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert the key at the correct position
            ids[j + 1] = key;
        }
    }

    // Display employee IDs
    public void displayEmployeeIds(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
