// Write a program that finds the second-largest value in an int array without sorting it.

public class Demo18 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second-largest value in the array.");
        } else {
            System.out.println("The second-largest value in the array is: " + secondLargest);
        }
    }
}