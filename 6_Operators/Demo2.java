// Create two boolean variables and print the result of combining them with &&.

public class Demo2 {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean haveUmbrella = false;
        
        boolean canGoOutside = isRaining && haveUmbrella;
        
        System.out.println("Can go outside: " + canGoOutside);
    }
}