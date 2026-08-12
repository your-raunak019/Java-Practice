//A method that finds the largest value in an array

public class Demo6 {

    public static void main(String[] args) {
        int[] scores = {72, 88, 95, 61, 84};
        int highest = findMax(scores);
        System.out.println("Highest score: " + highest);
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
}