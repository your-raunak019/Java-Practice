/*
Mini Project
Big Project: Restaurant Bill & Loyalty Calculator

Build a more complete restaurant billing program that combines every operator family from this topic:

1. Store the food subtotal, number of people splitting the bill, and whether the customer is a loyalty member (boolean).

2. Calculate a tip using compound assignment: start with the subtotal, then add 15% of itself to a running total using +=.

3. Apply a 10% loyalty discount using the ternary operator, but only if the customer is a loyalty member.

4. Apply an additional automatic 5% "large group" surcharge using && logic, but only if there are more than 6 people and the customer is not a loyalty member (loyalty members are exempt).

5. Calculate the exact amount each person owes by dividing the final total by the number of people — using a double division to get a precise, fair split, not a rounded-down one.

6. Print an itemized receipt: subtotal, tip, discount (if any), surcharge (if any), final total, and amount per person.

Try running this program with four different combinations of loyalty membership and group size, changing only the input variables each time, to prove your formula handles every case correctly.
*/

//---------------------------------------------------------------------------------------------------------


public class MiniProject6 {
    public static void main(String[] args) {
        // Input variables
        double subtotal = 100.00; // Example subtotal
        int numberOfPeople = 8; // Example number of people
        boolean isLoyaltyMember = false; // Example loyalty membership status

        // Calculate tip using compound assignment
        double tip = 0;
        tip += subtotal * 0.15; // Add 15% tip to the running total

        // Apply loyalty discount using ternary operator
        double discount = isLoyaltyMember ? subtotal * 0.10 : 0; // 10% discount if loyalty member

        // Apply large group surcharge using && logic
        double surcharge = (numberOfPeople > 6 && !isLoyaltyMember) ? subtotal * 0.05 : 0; // 5% surcharge for large groups not in loyalty program

        // Calculate final total
        double finalTotal = subtotal + tip - discount + surcharge;

        // Calculate amount per person
        double amountPerPerson = finalTotal / numberOfPeople;

        // Print itemized receipt
        System.out.println("Itemized Receipt:");
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tip (15%%): $%.2f%n", tip);
        System.out.printf("Discount (10%% if loyalty member): $%.2f%n", discount);
        System.out.printf("Surcharge (5%% for large groups): $%.2f%n", surcharge);
        System.out.printf("Final Total: $%.2f%n", finalTotal);
        System.out.printf("Amount Per Person: $%.2f%n", amountPerPerson);
    }
}
