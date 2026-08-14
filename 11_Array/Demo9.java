// Deliberately access an index one past the end of an array (like array[array.length]) and write down the exact exception message.

public class Demo9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[numbers.length]); // This will throw an ArrayIndexOutOfBoundsException
    }
}

// Output:

// --> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
