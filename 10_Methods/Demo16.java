// Write two methods with the same name pattern (like calculateSquare and calculateCube) that each return a number raised to a power.

public class Demo16 {

    public static void main(String[] args) {
        int number = 3;
        int square = calculateSquare(number);
        int cube = calculateCube(number);
        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The cube of " + number + " is: " + cube);
    }

    static int calculateSquare(int num) {
        return num * num;
    }

    static int calculateCube(int num) {
        return num * num * num;
    }
}