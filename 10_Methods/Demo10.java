//A small utility class combining several methods

public class Demo10 {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 1};
        int max = findMax(numbers);
        System.out.println("Max value: " + max);

        int[] sumAndProduct = calculateSumAndProduct(4, 5);
        System.out.println("Sum: " + sumAndProduct[0]);
        System.out.println("Product: " + sumAndProduct[1]);

        int number = 5;
        int factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);

        System.out.println("Is 14 even? " + isEven(14));
        System.out.println("Is 7 even? " + isEven(7));
    }

    static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    static int[] calculateSumAndProduct(int a, int b) {
        int sum = a + b;
        int product = a * b;
        return new int[]{sum, product};
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}