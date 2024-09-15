package Week7;

public interface Comparable<T> {
    int compareTo(T other);
}

public class IntegerComparable implements Comparable<Integer> {
    private Integer value;

    public IntegerComparable(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(Integer other) {
        return value.compareTo(other);
    }

    public Integer getValue() {
        return value;
    }
}

public class StringComparable implements Comparable<String> {
    private String value;

    public StringComparable(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(String other) {
        return value.compareTo(other);
    }

    public String getValue() {
        return value;
    }
}

public class CharacterComparable implements Comparable<Character> {
    private Character value;

    public CharacterComparable(Character value) {
        this.value = value;
    }

    @Override
    public int compareTo(Character other) {
        return value.compareTo(other);
    }

    public Character getValue() {
        return value;
    }
}

public class FloatComparable implements Comparable<Float> {
    private Float value;

    public FloatComparable(Float value) {
        this.value = value;
    }

    @Override
    public int compareTo(Float other) {
        return value.compareTo(other);
    }

    public Float getValue() {
        return value;
    }
}

public class ArrayUtils {

    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T findMin(T[] array) {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
}

public class App {
    public static void main(String[] args) {
        // Integer Array
        Integer[] intArray = { 3, 5, 1, 8, 2 };
        System.out.println("Max Integer: " + ArrayUtils.findMax(intArray));
        System.out.println("Min Integer: " + ArrayUtils.findMin(intArray));

        // String Array
        String[] strArray = { "apple", "orange", "banana", "pear" };
        System.out.println("Max String: " + ArrayUtils.findMax(strArray));
        System.out.println("Min String: " + ArrayUtils.findMin(strArray));

        // Character Array
        Character[] charArray = { 'a', 'z', 'f', 'b' };
        System.out.println("Max Character: " + ArrayUtils.findMax(charArray));
        System.out.println("Min Character: " + ArrayUtils.findMin(charArray));

        // Float Array
        Float[] floatArray = { 3.14f, 1.59f, 2.65f, 5.89f };
        System.out.println("Max Float: " + ArrayUtils.findMax(floatArray));
        System.out.println("Min Float: " + ArrayUtils.findMin(floatArray));
    }
}