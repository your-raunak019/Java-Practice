// Find the maximum and minimum

public class Demo2 {
    public static void main(String[] args) {
        int[] scores = {88, 92, 79, 95, 84};
        int max = scores[0];
        int min = scores[0];

        for (int score : scores) {          // Using enhanced for loop to iterate through the array
            if (score > max) max = score;
            if (score < min) min = score;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}