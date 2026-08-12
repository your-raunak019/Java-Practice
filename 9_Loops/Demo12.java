// Write nested loops to print a simple multiplication table (rows 1-5, columns 1-5) formatted neatly.

public class Demo12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t"); // Print product with a tab for spacing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}