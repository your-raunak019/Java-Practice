//One method calling another method

public class Demo5 {

    public static void main(String[] args) {
        double average = calculateAverage(85, 90, 78);
        System.out.println("Average: " + average);
    }

    static int sumOfThree(int a, int b, int c) {
        return a + b + c;
    }

    static double calculateAverage(int a, int b, int c) {
        int total = sumOfThree(a, b, c);
        return total / 3.0;
    }
}