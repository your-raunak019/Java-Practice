// Reverse an array in place

public class Demo3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
/* Output:
5 4 3 2 1
*/