// Write a method that takes three int grades and returns their average as a double.

public class Demo15 {

    public static void main(String[] args) {
        int grade1 = 85;
        int grade2 = 90;
        int grade3 = 78;
        double average = calculateAverage(grade1, grade2, grade3);
        System.out.println("The average of the grades is: " + average);
    }

    static double calculateAverage(int grade1, int grade2, int grade3) {
        return (grade1 + grade2 + grade3) / 3.0;
    }
}