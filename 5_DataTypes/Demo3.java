//try converting a double to an int using (int) yourValue.

public class Demo3{
    public static void main(String[] args) {
    
        double myDouble = 10.5;
        int myInt = (int) myDouble; // Explicitly cast double to int
        
        System.out.println("The value of myDouble is: " + myDouble);
        System.out.println("The value of myInt is: " + myInt);
    }
}