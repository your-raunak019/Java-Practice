// Research what compound assignment operators exist beyond += and -= (for example *=, /=, %=) and use at least two of them in a program.
public class Demo7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        x += y; // Equivalent to x = x + y
        System.out.println("x after +=: " + x);

        x *= y; // Equivalent to x = x * y
        System.out.println("x after *=: " + x);
    }
}
