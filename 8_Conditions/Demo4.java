// Write a small program simulating a very basic traffic light (using a String variable 'red', 'yellow', 'green') that prints what a driver should do, using switch.

import java.util.*;


public class Demo4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("Enter the Light Colour(Red/Yellow/Green) : ");
            String colour = scanner.nextLine();

            // light colour constants not required for this simple example

            String toDo = switch (colour){
                case "Red" -> "Stop";
                case "Yellow" -> "Slow";
                case "Green" -> "Go";
                default -> "Invalid colour";
            };
            System.out.println("The light is " + colour + ", you should: " + toDo);
        }
        
    }
}