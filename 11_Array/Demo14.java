// Write a program that searches for a specific value in an int array and prints whether it was found, using a loop (this is a simple version of what's called 'linear search').

// First Approach: 

public class Demo14 {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 5, 8, 4, 9, 34, 3, 6, 12, 21};
        int target = 9;
        
        // Variable to store the index if found (-1 means not found)
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("The targeted element " + target + " was found at index: " + foundIndex);
        } else {
            System.out.println("The targeted element " + target + " was not found in the array.");
        }
    }
}

// Second Approach:

/*

public class Demo14 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        for (int num : numbers) {
            if (num == target) {
                found = true;
                break; // Exit the loop once the target is found
            }
        }

        if (found) {
            System.out.println("Value " + target + " was found in the array.");
        } else {
            System.out.println("Value " + target + " was not found in the array.");
        }
    }
}

*/