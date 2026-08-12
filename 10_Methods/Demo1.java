public class Demo1 {

    public static void main(String[] args) {
        int area = calculateRectangleArea(5, 3);
        System.out.println("Area: " + area);

        printGreeting("Abbas");
        printGreeting("Sam");
    }

    static int calculateRectangleArea(int width, int height) {
        int area = width * height;
        return area;
    }

    static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
}