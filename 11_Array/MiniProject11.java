/*

Mini Project
Big Project: Complete Class Analytics Dashboard

Write a program that:

-> Stores at least 10 student test scores in an int array.
-> Calculates and prints the class average, highest score, and lowest score.
-> Sorts a copy of the array and prints the sorted list, without disturbing the original array's order.
-> Searches for a specific score the user provides, printing whether it was found and at which original index.
-> Builds a grade-frequency table using the tally-table technique, but bucketed into letter grades (count how many scores fall into A/B/C/D/F ranges) instead of raw digits.
-> Uses a 2D array to store scores for 3 different subjects across the same 10 students (a 10×3 grid), and prints each student's personal average across all three subjects.
-> Prints one complete, clearly organized report combining every result above.

This project deliberately reuses almost every technique from this topic's 10 worked examples — treat it as proof that you can combine them, not just run them individually.

*/

import java.util.Arrays;
import java.util.Scanner;

public class MiniProject11 {
    public static void main(String[] args) {

        // 1. Initial Data Setup (10 Student Scores)
        int[] scores = {45, 67, 88, 79, 58, 91, 35, 71, 82, 69};

        System.out.println("==========================================");
        System.out.println("        CLASS ANALYTICS DASHBOARD         ");
        System.out.println("==========================================");

        // --- STEP 1: Basic Statistics ---
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int score : scores) {
            sum += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }

        double average = sum / (double) scores.length;

        System.out.println("\n[1] CLASS OVERVIEW");
        System.out.printf("  Average Score : %.2f\n", average);
        System.out.println("  Highest Score : " + max);
        System.out.println("  Lowest Score  : " + min);

        // --- STEP 2: Copy & Sort (Bubble Sort) ---
        int[] sortedScores = scores.clone();

        for (int i = 0; i < sortedScores.length - 1; i++) {
            for (int j = 0; j < sortedScores.length - 1 - i; j++) {
                if (sortedScores[j] > sortedScores[j + 1]) {
                    int temp = sortedScores[j];
                    sortedScores[j] = sortedScores[j + 1];
                    sortedScores[j + 1] = temp;
                }
            }
        }

        System.out.println("\n[2] SORTED SCORES");
        System.out.println("  Sorted Copy   : " + Arrays.toString(sortedScores));
        System.out.println("  Original List : " + Arrays.toString(scores));

        // --- STEP 3: Linear Search ---
        System.out.println("\n[3] SEARCH SCORE");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("  Enter a score to search: ");
            int target = scanner.nextInt();

            int foundIndex = -1;
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] == target) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                System.out.println("  Result: Score " + target + " found at original index " + foundIndex);
            } else {
                System.out.println("  Result: Score " + target + " was not found in the list.");
            }
        }

        // --- STEP 4: Grade Frequency Tally ---
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int score : scores) {
            if (score >= 90) {
                countA++;
            } else if (score >= 80) {
                countB++;
            } else if (score >= 70) {
                countC++;
            } else if (score >= 60) {
                countD++;
            } else {
                countF++;
            }
        }

        System.out.println("\n[4] GRADE FREQUENCY TABLE");
        System.out.println("  A (90-100) : " + countA);
        System.out.println("  B (80-89)  : " + countB);
        System.out.println("  C (70-79)  : " + countC);
        System.out.println("  D (60-69)  : " + countD);
        System.out.println("  F (< 60)   : " + countF);

        // --- STEP 5: 2D Array Matrix (10 Students x 3 Subjects) ---
        int[][] subjectScores = {
            {45, 50, 60},  // Student 1
            {67, 70, 72},  // Student 2
            {88, 90, 85},  // Student 3
            {79, 81, 75},  // Student 4
            {58, 62, 60},  // Student 5
            {91, 95, 93},  // Student 6
            {35, 40, 42},  // Student 7
            {71, 75, 78},  // Student 8
            {82, 80, 84},  // Student 9
            {69, 72, 70}   // Student 10
        };

        System.out.println("\n[5] MULTI-SUBJECT STUDENT AVERAGES (10x3 Grid)");
        System.out.println("------------------------------------------");
        for (int i = 0; i < subjectScores.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < subjectScores[i].length; j++) {
                studentSum += subjectScores[i][j];
            }
            double studentAvg = studentSum / (double) subjectScores[i].length;
            System.out.printf("  Student %-2d Average: %.2f\n", (i + 1), studentAvg);
        }
        System.out.println("==========================================");
    }
}

// Output (by taking User Input as: 69):

/*

==========================================
        CLASS ANALYTICS DASHBOARD         
==========================================

[1] CLASS OVERVIEW
  Average Score : 68.50
  Highest Score : 91
  Lowest Score  : 35

[2] SORTED SCORES
  Sorted Copy   : [35, 45, 58, 67, 69, 71, 79, 82, 88, 91]
  Original List : [45, 67, 88, 79, 58, 91, 35, 71, 82, 69]

[3] SEARCH SCORE
  Enter a score to search: 69
  Result: Score 69 found at original index 9

[4] GRADE FREQUENCY TABLE
  A (90-100) : 1
  B (80-89)  : 2
  C (70-79)  : 2
  D (60-69)  : 2
  F (< 60)   : 3

[5] MULTI-SUBJECT STUDENT AVERAGES (10x3 Grid)
------------------------------------------
  Student 1  Average: 51.67
  Student 2  Average: 69.67
  Student 3  Average: 87.67
  Student 4  Average: 78.33
  Student 5  Average: 60.00
  Student 6  Average: 93.00
  Student 7  Average: 39.00
  Student 8  Average: 74.67
  Student 9  Average: 82.00
  Student 10 Average: 70.33
==========================================

*/