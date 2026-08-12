//A boolean-returning helper method

public class Demo4 {

    public static void main(String[] args) {
        System.out.println(isEven(14));
        System.out.println(isEven(7));
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}