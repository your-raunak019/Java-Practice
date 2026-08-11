// Write a do-while loop that asks the user (using Scanner) to type 'yes' to continue, repeating until they do.

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String input;

            do {
                System.out.print("Type 'yes' to continue: ");
                input = scanner.nextLine().trim();
            } while (!input.equalsIgnoreCase("yes"));

            System.out.println("Great! Moving on to the next step...");
        }
    }
}