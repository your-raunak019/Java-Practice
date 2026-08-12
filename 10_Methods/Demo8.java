//A method returning two related results using an array

public class Demo8 {

    public static void main(String[] args) {
        int[] results = calculateSumAndProduct(4, 5);
        System.out.println("Sum: " + results[0]);
        System.out.println("Product: " + results[1]);
    }

    static int[] calculateSumAndProduct(int a, int b) {
        int sum = a + b;
        int product = a * b;
        return new int[]{sum, product};
    }
}