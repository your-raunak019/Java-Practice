//Varargs — accepting any number of arguments

public class Demo9 {

    public static void main(String[] args) {
        int sum1 = sum(1, 2, 3);
        int sum2 = sum(4, 5);
        int sum3 = sum(6, 7, 8, 9);

        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
    }

    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}