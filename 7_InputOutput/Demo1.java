import java.util.Scanner;
public class Demo1{
    public static void main(String[] args){
        
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Enter Your Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Your Age: ");
            int age = scanner.nextInt();
            
            System.out.print("Hello " +name +" !" +", " +"You will be " +(age + 10) +" years Old Afte 10 years.");
        }
    }
}