// Research what Arrays.toString() does, and use it to print an entire array on one line without writing your own loop.

/*

Arrays.toString() is a method from the java.util.Arrays class that returns a string representation of the contents of the specified array. It formats the array elements in a readable way, enclosed in square brackets and separated by commas.

*/

public class Demo16 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};

        System.out.println("Array contents: " + java.util.Arrays.toString(numbers));
    }
}