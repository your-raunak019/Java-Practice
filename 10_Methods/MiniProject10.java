/*

Mini Project
Big Project: Personal Finance Toolkit

Build a program made entirely of small, focused methods, all called from main:

-> A method calculateMonthlySavings(double income, double expenses) that returns income minus expenses.
-> A method projectYearlySavings(double monthlySavings) that returns the monthly amount multiplied by 12, calling the previous method's result as its input.
-> A method isPrime(int number) that returns whether a number is prime — reuse this later to add a "lucky number" feature to a savings goal (any goal amount that's prime gets a bonus message).
-> A recursive method calculateCompoundGrowth(double amount, double rate, int years) that calculates compound growth year by year using recursion instead of a loop.
-> A varargs method totalExpenses(double... expenses) that sums up any number of individual expense amounts.
-> A method printFinanceReport(...) that calls all of the above and prints one clean, complete report.
The goal of this project is entirely about method design — notice how main itself should end up almost entirely made of method calls, with barely any raw calculation logic sitting directly inside it.

*/

import java.util.Scanner;

public class MiniProject10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your monthly income: ");
            double income = scanner.nextDouble();

            System.out.print("Enter your monthly expenses: ");
            double expenses = scanner.nextDouble();

            double monthlySavings = calculateMonthlySavings(income, expenses);
            double yearlySavings = projectYearlySavings(monthlySavings);

            System.out.print("Enter a number to check if it's prime: ");
            int numberToCheck = scanner.nextInt();
            boolean isNumberPrime = isPrime(numberToCheck);

            System.out.print("Enter the initial amount for compound growth: ");
            double initialAmount = scanner.nextDouble();

            System.out.print("Enter the annual growth rate (as a decimal): ");
            double growthRate = scanner.nextDouble();

            System.out.print("Enter the number of years for compound growth: ");
            int years = scanner.nextInt();

            double compoundGrowth = calculateCompoundGrowth(initialAmount, growthRate, years);

            System.out.print("Enter your individual expenses (comma-separated): ");
            String[] expenseInputs = scanner.next().split(",");
            double[] expensesArray = new double[expenseInputs.length];
            for (int i = 0; i < expenseInputs.length; i++) {
                expensesArray[i] = Double.parseDouble(expenseInputs[i]);
            }
            double totalExpensesAmount = totalExpenses(expensesArray);

            printFinanceReport(monthlySavings, yearlySavings, isNumberPrime, compoundGrowth, totalExpensesAmount);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }

    static double calculateMonthlySavings(double income, double expenses) {
        return income - expenses;
    }

    static double projectYearlySavings(double monthlySavings) {
        return monthlySavings * 12;
    }

    static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    static double calculateCompoundGrowth(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        } else {
            return calculateCompoundGrowth(amount * (1 + rate), rate, years - 1);
        }
    }

    static double totalExpenses(double... expenses) {
        double total = 0;
        for (double expense : expenses) {
            total += expense;
        }
        return total;
    }

    static void printFinanceReport(double monthlySavings, double yearlySavings, boolean isNumberPrime, double compoundGrowth, double totalExpensesAmount) {
        System.out.println("\n--- Finance Report ---");
        System.out.printf("Monthly Savings: $%.2f%n", monthlySavings);
        System.out.printf("Yearly Savings: $%.2f%n", yearlySavings);
        System.out.printf("Is the number prime? %b%n", isNumberPrime);
        System.out.printf("Compound Growth after specified years: $%.2f%n", compoundGrowth);
        System.out.printf("Total Expenses: $%.2f%n", totalExpensesAmount);
    }

}