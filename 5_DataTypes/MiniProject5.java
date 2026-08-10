/*

Mini Project
Big Project: Multi-Product Inventory Card

Build a single program modeling a small store's inventory, deliberately choosing the most appropriate primitive type for every single piece of data:

1. Three products, each with: a name (String), a single-letter size code (char), a price (double), a stock quantity (int), and whether it's on sale (boolean).
2. A store-wide total items in stock, added up across all three products (use a type that definitely won't overflow even for a huge store).
3. A calculated "sale price" for each product that's on sale: original price minus 15%, using the ternary operator from this topic's tenth example to decide whether the discount applies.
4. A grand total value of the entire inventory (price × quantity, summed across all three products), calculated using the sale price where applicable.
5. Print a clean, itemized report: each product's details on its own group of lines, followed by the store-wide totals at the end.
As you build this, deliberately narrate (in code comments) which type you picked for each variable and why — that habit of justifying your type choices is exactly what separates a beginner from someone who's internalized this topic.

*/

public class MiniProject5 {
    public static void main(String[] args) {

        // Product 1: Pen
        String product1Name = "Pen";  // String for product name
        char product1Size = 'S';  // char for single-letter size code
        double product1Price = 2.50;  // double for precise price
        int product1Stock = 150;  // int for stock quantity
        boolean product1OnSale = true;  // boolean for sale status
        
        // Product 2: Notebook
        String product2Name = "Notebook";  // String for product name
        char product2Size = 'M';  // char for single-letter size code
        double product2Price = 5.99;  // double for precise price
        int product2Stock = 87;  // int for stock quantity
        boolean product2OnSale = false;  // boolean for sale status
        
        // Product 3: Pencil
        String product3Name = "Pencil";  // String for product name
        char product3Size = 'S';  // char for single-letter size code
        double product3Price = 1.25;  // double for precise price
        int product3Stock = 320;  // int for stock quantity
        boolean product3OnSale = true;  // boolean for sale status
        
        // Store-wide total items in stock (long to prevent overflow for huge stores)
        long totalItemsInStock = (long)product1Stock + product2Stock + product3Stock;
        
        // Calculate sale prices using ternary operator
        double salePrice1 = product1OnSale ? product1Price * 0.85 : product1Price;
        double salePrice2 = product2OnSale ? product2Price * 0.85 : product2Price;
        double salePrice3 = product3OnSale ? product3Price * 0.85 : product3Price;
        
        // Calculate inventory value for each product (sale price × quantity)
        double inventoryValue1 = salePrice1 * product1Stock;
        double inventoryValue2 = salePrice2 * product2Stock;
        double inventoryValue3 = salePrice3 * product3Stock;
        
        // Grand total inventory value (double for precise monetary calculations)
        double grandTotalValue = inventoryValue1 + inventoryValue2 + inventoryValue3;
        
        // Print itemized report
        System.out.println("========== STORE INVENTORY REPORT ==========\n");
        
        System.out.println("Product 1: " + product1Name);
        System.out.println("  Size: " + product1Size);
        System.out.println("  Original Price: $" + product1Price);
        System.out.println("  On Sale: " + product1OnSale);
        System.out.println("  Sale Price: $" + salePrice1);
        System.out.println("  Stock: " + product1Stock);
        System.out.println("  Inventory Value: $" + inventoryValue1 + "\n");
        
        System.out.println("Product 2: " + product2Name);
        System.out.println("  Size: " + product2Size);
        System.out.println("  Original Price: $" + product2Price);
        System.out.println("  On Sale: " + product2OnSale);
        System.out.println("  Sale Price: $" + salePrice2);
        System.out.println("  Stock: " + product2Stock);
        System.out.println("  Inventory Value: $" + inventoryValue2 + "\n");
        
        System.out.println("Product 3: " + product3Name);
        System.out.println("  Size: " + product3Size);
        System.out.println("  Original Price: $" + product3Price);
        System.out.println("  On Sale: " + product3OnSale);
        System.out.println("  Sale Price: $" + salePrice3);
        System.out.println("  Stock: " + product3Stock);
        System.out.println("  Inventory Value: $" + inventoryValue3 + "\n");
        
        System.out.println("========== STORE-WIDE TOTALS ==========");
        System.out.println("Total Items in Stock: " + totalItemsInStock);
        System.out.println("Grand Total Inventory Value: $" + grandTotalValue);
    }
}
