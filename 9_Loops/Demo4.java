// Write a while loop that keeps dividing a starting number by 2 until it's less than 1, printing each step.

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a starting number: ");
            double number = scanner.nextDouble();

            while (number >= 1) {
                System.out.println("Current number: " + number);
                number /= 2;
            }

            System.out.println("The number is now less than 1.");
        }
    }
}

//By using do-while loop, we can ensure that the loop executes at least once, even if the starting number is less than 1. Here's how you can modify the code to use a do-while loop:

/*

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a starting number: ");
            double number = scanner.nextDouble();

            do {
                System.out.println("Current number: " + number);
                number /= 2;
            } while (number >= 1);

            System.out.println("The number is now less than 1.");
        }
    }
}
    
*/

