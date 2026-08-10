import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)){
            
            System.out.print("Enter Your Username: ");
            String enteredUsername = scanner.nextLine();
            
            System.out.print("Enter Your Password: ");
            String enteredPassword = scanner.nextLine();
            
            String correctUsername = "roney_18";
            String correctPassword = "@#161521#@";


            if (enteredUsername.equals(correctUsername)) {
                if (enteredPassword.equals(correctPassword)) {
                    System.out.println("Login successful!");
                }
                else {
                    System.out.println("Wrong password.");
                }
            }
            else {
                System.out.println("Username not found.");
            }
        }
    }
}