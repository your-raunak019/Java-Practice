/*

Mini Project
Big Project: Complete Student Report Card System

Write a program that:

1. Asks the user (via Scanner) to type scores for three subjects: Math, Science, and English.
2. Calculates the average of all three scores.
3. Uses if/else if/else to assign a letter grade to the average: 90+ is A, 75-89 is B, 60-74 is C, below 60 is F.
4. Uses a nested if to check, for each individual subject, whether that specific subject scored below 60 — printing a specific "Needs improvement in [subject]" message for any subject that does.
5. Uses a switch statement to print a different one-sentence encouragement message based on the letter grade (A through F, five cases).
6. Uses combined && logic to determine and print whether the student qualifies for the honor roll: average of 85+ and no individual subject below 70.
7. Prints a complete, clearly formatted report card showing all three subject scores, the average, the letter grade, any improvement warnings, the encouragement message, and the honor roll status.

*/

import java.util.Scanner;

public class MiniProject8 {
    public static void main(String[] args) {

        // Use try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("==========================================");
            System.out.println("   STUDENT REPORT CARD GENERATOR SYSTEM   ");
            System.out.println("==========================================");

            // 1. Get subject scores from user
            System.out.print("Enter Math score    : ");
            double math = scanner.nextDouble();

            System.out.print("Enter Science score : ");
            double science = scanner.nextDouble();

            System.out.print("Enter English score : ");
            double english = scanner.nextDouble();

            // 2. Calculate the average score
            double average = (math + science + english) / 3.0;

            // 3. Assign letter grade using if / else if / else
            char grade;
            if (average >= 90) {
                grade = 'A';
            } else if (average >= 75) {
                grade = 'B';
            } else if (average >= 60) {
                grade = 'C';
            } else {
                grade = 'F';
            }

            // 4. Determine Honor Roll status using combined && logic
            // (Average must be 85+ AND no individual subject below 70)
            boolean isHonorRoll = (average >= 85) && (math >= 70 && science >= 70 && english >= 70);

            // 5. Select encouragement message using a switch statement
            String encouragement = switch (grade) {
                case 'A' -> "Outstanding work! Keep aiming high.";
                case 'B' -> "Great job! You are building solid skills.";
                case 'C' -> "Good effort! A little extra practice will push you higher.";
                case 'D' -> "Passing, but keep putting in the study hours.";
                case 'F' -> "Don't be discouraged! Review the basics and try again.";
                default -> "Keep working hard towards your goals!";
            };

            // 6. Print the formatted Report Card
            System.out.println("\n==========================================");
            System.out.println("           OFFICIAL REPORT CARD           ");
            System.out.println("==========================================");
            System.out.printf("  Math Score       : %.2f\n", math);
            System.out.printf("  Science Score    : %.2f\n", science);
            System.out.printf("  English Score    : %.2f\n", english);
            System.out.println("------------------------------------------");
            System.out.printf("  Average Score    : %.2f\n", average);
            System.out.println("  Overall Grade    : " + grade);
            System.out.println("------------------------------------------");
            
            // Check individual subject warnings (below 60)
            System.out.println("  IMPROVEMENT WARNINGS:");
            boolean hasWarnings = false;

            if (math < 60) {
                System.out.println("   - Needs improvement in Math");
                hasWarnings = true;
            }
            if (science < 60) {
                System.out.println("   - Needs improvement in Science");
                hasWarnings = true;
            }
            if (english < 60) {
                System.out.println("   - Needs improvement in English");
                hasWarnings = true;
            }
            if (!hasWarnings) {
                System.out.println("   - None! Passed all subjects above threshold.");
            }

            System.out.println("------------------------------------------");
            System.out.println("  Honor Roll Status : " + (isHonorRoll ? "QUALIFIED 🌟" : "Not Qualified"));
            System.out.println("  Encouragement     : " + encouragement);
            System.out.println("==========================================\n");
        }
    }
}