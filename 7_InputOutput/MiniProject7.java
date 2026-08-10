/*

Mini Project
Big Project: Interactive Grocery Checkout

Write a program that simulates a small grocery checkout, reading everything from the keyboard:

1. Ask for the customer's name (a full line, since names can contain spaces).
2. Ask for three separate item names, and each item's price and quantity (six prompts total, three pairs).
3. Calculate each item's line total (price × quantity), and a running subtotal across all three items.
4. Ask whether the customer has a loyalty card by having them type "yes" or "no" — read this as a String, not a boolean, since Scanner has no direct boolean reader.
5. For now, it's okay to just check loyaltyAnswer.equals("yes") without a full if/else chain (Conditions is next) — focus on getting every single input correctly read in the right order, especially watching out for the nextInt()/ nextLine() trap from Example 5 above.
6. Print a complete, clearly formatted receipt with the customer's name, every item with its line total, the subtotal, and a final total.

*/

import java.util.Scanner;

public class MiniProject7 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Enter your Name: ");
            String name = scanner.nextLine();
            
            // ----- ITEM 1 -----
            System.out.println("\n----- Item 1 Details -----");
            
            System.out.print("Item 1 Name: ");
            String firstItem = scanner.nextLine();
            
            System.out.print("Item 1 Price: ");
            double firstPrice = scanner.nextDouble();
            
            System.out.print("Item 1 Quantity: ");
            int firstQuantity = scanner.nextInt();
            
            scanner.nextLine(); // ✅ Clear buffer after nextInt()
            
            double total1 = firstPrice * firstQuantity;
            System.out.println("Total Price of " + firstItem + " is: Rs. " + total1);
            
            // ----- ITEM 2 -----
            System.out.println("\n----- Item 2 Details -----");
            
            System.out.print("Item 2 Name: ");
            String secondItem = scanner.nextLine();
            
            System.out.print("Item 2 Price: ");
            double secondPrice = scanner.nextDouble();
            
            System.out.print("Item 2 Quantity: ");
            int secondQuantity = scanner.nextInt();
            
            scanner.nextLine(); // ✅ Clear buffer after nextInt()
            
            double total2 = secondPrice * secondQuantity;
            System.out.println("Total Price of " + secondItem + " is: Rs. " + total2);
            
            // ----- ITEM 3 -----
            System.out.println("\n----- Item 3 Details -----");
            
            System.out.print("Item 3 Name: ");
            String thirdItem = scanner.nextLine();
            
            System.out.print("Item 3 Price: ");
            double thirdPrice = scanner.nextDouble();
            
            System.out.print("Item 3 Quantity: ");
            int thirdQuantity = scanner.nextInt();
            
            double total3 = thirdPrice * thirdQuantity;
            System.out.println("Total Price of " + thirdItem + " is: Rs. " + total3);
            
            // ----- FINAL BILL -----
            double totalAmount = total1 + total2 + total3;
            System.out.println("\n----------------------------------");
            System.out.println("Dear " + name + "! You Have To Pay Rs. " + totalAmount);
            System.out.println("Thank You, Visit Again!");
        }
    }
}