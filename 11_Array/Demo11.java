// Write a program that reverses the order of elements(unsorted elements) in an int array (without using a built-in reverse method) and prints the result. 

public class Demo11 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;

        // Create a new array to hold the reversed elements
        int[] reversed = new int[n];

        // Reverse the order of elements
        for (int i = 0; i < n; i++) {
            reversed[i] = numbers[n - 1 - i];
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}

// Another approach to reverse the array in place without using an additional array:
/*

public class Demo11 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;

        // Reverse the array in place
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

*/

// Another approach to reverse the array.

/*

public class ArrayExample04 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}

*/