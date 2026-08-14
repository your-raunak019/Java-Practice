// Research what Arrays.sort() does (from java.util.Arrays), and use it to sort an int array, printing before and after.

/*

"Arrays.sort() is a method from the java.util.Arrays class that sorts the specified array into ascending numerical order. It uses a dual-pivot quicksort algorithm for primitive types, which is efficient and fast for most cases."

*/

public class Demo15 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};

        System.out.print("Before sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        java.util.Arrays.sort(numbers);

        System.out.print("After sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}