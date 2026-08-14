//  Sum and average of an array


//By using traditinal for loop

public class Demo1 {
    public static void main(String[] args) {
        int[] scores = {88, 92, 79, 95, 84};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i]; // Fetch the item manually using index
            sum += score;
        }
        double average = sum / (double) scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

//By using enhanced for loop


// public class Demo1 {
//     public static void main(String[] args) {
//         int[] scores = {88, 92, 79, 95, 84};
//         int sum = 0;

//         for (int score : scores) {
//             sum += score;
//         }
//         double average = sum / (double) scores.length;

//         System.out.println("Sum: " + sum);
//         System.out.println("Average: " + average);
//     }
// }

