/*

Mini Project
Number Guessing Game

Write a program that:

-> Picks a fixed secret number (we'll cover truly random numbers in a later topic — a fixed number is fine for now).
-> Uses a loop to repeatedly ask the user (via Scanner) to guess the number.
-> After each guess, tells the user if their guess was too high, too low, or correct.
-> Stops looping once the user guesses correctly, and prints how many attempts it took.

*/

import java.util.Scanner;

public class MiniProject9 {
    public static void main(String[] args) {
        int SECRET_NUMBER = 57; // Fixed secret number
        int attempts = 0; // Counter for the number of attempts
        int guess; // Variable to store the user's guess

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Try to guess the secret number between 1 and 100.");

            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++; // Increment attempts after each guess

                if (guess < SECRET_NUMBER) {
                    System.out.println("Too low! Try again.");
                } else if (guess > SECRET_NUMBER) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number: " + SECRET_NUMBER);
                    System.out.println("It took you " + attempts + " attempts.");
                }
            } while (guess != SECRET_NUMBER);
        }
    }
}