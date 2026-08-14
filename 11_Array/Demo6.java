// Bubble sort — sorting an array manually

public class Demo6 {
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
/* Output:
11 12 22 25 64
*/