// Write a for loop that prints a simple multiplication table for the number 5 (5x1 through 5x10).

public class Demo5 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

///another way to write the same code:///

/*

public class Demo5 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " +product);
        }
    }
}
    
*/