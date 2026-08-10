import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            scanner.nextLine(); // consumes the leftover Enter key — the fix
            
            System.out.print("Enter your favorite quote: ");
            String quote = scanner.nextLine();
            
            System.out.println("Age: " + age);
            System.out.println("Quote: " + quote);
        }
    }
}