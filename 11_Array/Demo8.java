// Digit frequency counter using an array as a tally table

public class Demo8 {
    public static void main(String[] args) {
        int[] data = {3, 7, 3, 1, 9, 3, 7, 0, 1, 3};
        int[] frequency = new int[10]; // one slot per digit 0-9

        for (int value : data) {
            frequency[value]++;
        }

        for (int digit = 0; digit < frequency.length; digit++) {
            if (frequency[digit] > 0) {
                System.out.println(digit + " appears " + frequency[digit] + " times");
            }
        }
    }
}