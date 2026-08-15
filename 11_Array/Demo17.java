// Write a program that copies all values from one array into a new, larger array (simulating what 'resizing' an array actually requires).


public class Demo17 {
    public static void main(String[] args) {
        int[] originalArray = {5, 2, 8, 1, 4};
        int newSize = originalArray.length * 2;
        int[] newArray = new int[newSize];

        // Copying values from original array to new array
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

        System.out.println("Original array: " + java.util.Arrays.toString(originalArray));
        System.out.println("New array (resized): " + java.util.Arrays.toString(newArray));
    }
}

