package countingsort;

public class StudentAgeSorter {

    // Counting Sort function
    public void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] sortedAges = new int[ages.length];

        // Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = ages.length - 1; i >= 0; i--) {
            sortedAges[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted ages back to the original array
        System.arraycopy(sortedAges, 0, ages, 0, ages.length);
    }

    // Display sorted ages
    public void displayAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
}
