// Research what a 'recursive method' is (a method that calls itself), and write a simple recursive method that calculates a factorial (like 5! = 5*4*3*2*1).

public class Demo18 {

    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive case
        }
    }
}