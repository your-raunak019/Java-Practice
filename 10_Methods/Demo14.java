// Write a method that calculates the area of a circle given its radius (use 3.14159 for pi).

public class Demo14 {

    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    static double calculateCircleArea(double radius) {
        return 3.14159 * radius * radius;
    }
}