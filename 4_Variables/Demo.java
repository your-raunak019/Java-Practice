//Write a program that swaps the values of two int variables (so a becomes b's value and b becomes a's value) using a third temporary variable.

public class Demo {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
        
}
