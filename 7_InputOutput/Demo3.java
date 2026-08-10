//Write a program that reads a decimal number using nextDouble() and prints double that value.

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Enter a Decimal Number: ");
            double number = scanner.nextDouble();
            
            double result = number * 2;
            
            System.out.println("Double of the Number: " + number + " is: " + result);
        }
    }
}