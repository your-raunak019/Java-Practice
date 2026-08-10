// Research what scanner.next() (no 'Line') does differently from scanner.nextLine(), and test the difference with input that has multiple words.

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine(); // Reads the entire line, including spaces
            
            System.out.println("Your full name is: " + fullName);
            
            System.out.print("Enter your first name: ");
            String firstName = scanner.next(); // Reads only the next token (up to the first space)
            
            System.out.println("Your first name is: " + firstName);
        }
    }
}