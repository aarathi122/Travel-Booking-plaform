package Week7;

public class BinarySearch<T extends Comparable<T>> {
    private T[] array;

    public BinarySearch(T[] array) {
        this.array = array;
    }

    public int search(T key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = array[mid].compareTo(key);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Key not found
    }
}

public class App2 {
    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        BinarySearch<Integer> intSearch = new BinarySearch<>(intArray);
        System.out.println("Index of 5: " + intSearch.search(5)); // Should print index of 5

        // Test with Double array
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        BinarySearch<Double> doubleSearch = new BinarySearch<>(doubleArray);
        System.out.println("Index of 3.3: " + doubleSearch.search(3.3)); // Should print index of 3.3

        // Test with String array
        String[] stringArray = { "apple", "banana", "cherry", "date", "fig" };
        BinarySearch<String> stringSearch = new BinarySearch<>(stringArray);
        System.out.println("Index of 'cherry': " + stringSearch.search("cherry")); // Should print index of 'cherry'
    }
}
