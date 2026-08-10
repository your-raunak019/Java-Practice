//Write a program that asks for a whole number and prints whether it's even or odd (using % from the Operators topic).

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Enter a Whole Number: ");
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                System.out.println("The Number: " + number + " is Even Number.");
            } else {
                System.out.println("The Number: " + number + " is Odd Number.");
            }
            // No scanner.close() needed here—it closes automatically! because we used try-with-resources.
        }
    }
}