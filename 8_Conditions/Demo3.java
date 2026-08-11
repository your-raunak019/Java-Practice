//Write a program that classifies a BMI value (weight/height calculation) into categories using else if chains researched from general BMI category ranges.

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your weight in kilograms: ");
            double weight = scanner.nextDouble();
            
            System.out.print("Enter your height in meters: ");
            double height = scanner.nextDouble();
            
            double bmi = weight / (height * height);
            System.out.printf("Your BMI is: %.2f%n", bmi);
            
            if (bmi < 18.5) {
                System.out.println("You are classified as Underweight.");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("You are classified as Normal weight.");
            } else if (bmi >= 25 && bmi < 29.9) {
                System.out.println("You are classified as Overweight.");
            } else {
                System.out.println("You are classified as Obese.");
            }
        }
    }
}   