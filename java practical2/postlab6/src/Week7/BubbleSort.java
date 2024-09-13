package Week7;

import java.util.Arrays;

public class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, break
            if (!swapped)
                break;
        }
    }
}

public class BubbleSortTest {
    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = { 5, 1, 8, 3, 2 };
        BubbleSort.bubbleSort(intArray);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

        // Test with Double array
        Double[] doubleArray = { 4.4, 2.2, 5.5, 1.1, 3.3 };
        BubbleSort.bubbleSort(doubleArray);
        System.out.println("Sorted Double array: " + Arrays.toString(doubleArray));

        // Test with String array
        String[] stringArray = { "banana", "apple", "date", "cherry", "fig" };
        BubbleSort.bubbleSort(stringArray);
        System.out.println("Sorted String array: " + Arrays.toString(stringArray));
    }
}