// Write a program with a for loop nested inside another for loop that prints a 3x3 grid of stars (*).

public class Demo6 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=3; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}