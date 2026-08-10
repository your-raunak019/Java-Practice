// Write an expression combining && and || together, then research how Java decides which operator runs first without parentheses.
public class Demo6 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Expression combining && and ||
        boolean result = a || b && c;

        System.out.println("Result: " + result);
    }
}
