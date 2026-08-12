// Write a method that takes an int by the user and returns true if it's even, false if it's odd.

import java.util.Scanner;
public class Demo12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            boolean isEven = isEven(number);
            System.out.println("Is the number even? " + isEven);
        }
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
