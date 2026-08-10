/**
 Mini Project
Big Project: Personal Finance Snapshot

Build a single program, using only variables and println (no input, no loops, no conditions yet — this project is entirely about applying what this topic taught), that prints a full personal finance snapshot. Requirements:

1. Store your name, monthly income, and monthly rent in appropriate variables.
2. Store at least three other monthly expenses (groceries, transport, subscriptions) as separate variables.
3. Calculate total monthly expenses by adding all expense variables together.
4. Calculate monthly savings as income minus total expenses.
5. Calculate what percentage of income is being saved (savings divided by income, multiplied by 100).
6. Calculate projected yearly savings (monthly savings multiplied by 12).
7. Print a neatly labeled report with every one of these values, each on its own line.
8. Partway through the program, give yourself a raise by increasing the income variable, recalculate everything, and print a second "after raise" report showing the new numbers.

This project deliberately has no loops or conditions — the goal is to prove to yourself that variables and arithmetic alone are already powerful enough to model something genuinely useful, before you add more tools to the toolbox in later topics.

 */

public class MiniProject4 {
    public static void main(String[] args) {
        String name = "Rounak";
        int income = 70000;
        int rent = 10000;
        
        int grocery = 5000;
        int transport = 3000;
        int subscription = 2000;
        
        int monthlyExpenses = grocery + transport + subscription;
        
        int savings = income - (rent + grocery + transport + subscription);
        
        // Explicitly cast 'savings' to float before dividing
        float savingPercentage = ((float) savings / income) * 100;
        
        int yearlySavings = savings * 12;
        
        System.out.println("1.Name = " + name);
        System.out.println("2.Income = " + income);
        System.out.println("3.Rent = " + rent);
        
        System.out.println("4.Monthly Expenses = " + monthlyExpenses);
        System.out.println("5.Savings = " + savings);
        System.out.println("6.Saving Percentage = " + savingPercentage + "%");
        System.out.println("7.Yearly Savings = " + yearlySavings);
    }
}