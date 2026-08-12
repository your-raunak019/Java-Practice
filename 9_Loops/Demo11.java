// Write a while loop that reverses the digits of a number (for example, 1234 becomes 4321) using % and / operators from the Operators topic.

public class Demo11 {
    public static void main(String[] args) {
        int number = 1234; // Example number to reverse
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}