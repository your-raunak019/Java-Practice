// Write a for loop that finds and prints all prime numbers between 2 and 50.

public class Demo9 {
    public static void main(String[] args) {
        
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}