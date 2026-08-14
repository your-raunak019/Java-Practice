// Write a method that validates whether a given password (String) is at least 8 characters long, returning a boolean.

public class Demo19 {

    public static void main(String[] args) {
        String password = "myPassword123";
        boolean isValid = validatePassword(password);
        System.out.println("Is the password valid? " + isValid);
    }

    static boolean validatePassword(String password) {
        return password.length() >= 8;
    }
}