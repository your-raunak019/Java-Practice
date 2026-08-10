//-----------------------------------------------------------------------------------------------------
// OLD SWITCH CASE STATEMENT
//-------------------------------------------------------------------------------------------------------
// import java.util.Scanner;

// public class Demo2 {
//     public static void main(String[] args) {
        
//         try (Scanner scanner = new Scanner(System.in)) {
//             System.out.print("Enter a day number (1-7): ");
//             int day = scanner.nextInt();

//             String dayName;

//             switch (day) {
//                 case 1:
//                     dayName = "Monday";
//                     break;
//                 case 2:
//                     dayName = "Tuesday";
//                     break;
//                 case 3:
//                     dayName = "Wednesday";
//                     break;
//                 case 4:
//                     dayName = "Thursday";
//                     break;
//                 case 5:
//                     dayName = "Friday";
//                     break;
//                 case 6:
//                 case 7:
//                     dayName = "Weekend";
//                     break;
//                 default:
//                     dayName = "Invalid Day";
//                     break;
//             }

//             System.out.println("Day " + day + " is: " + dayName);
//         }
//     }
// }



//------------------------------------------------------------------------------------------------------
// NEW SWITCH CASE STATEMENT
//------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a day number (1-7): ");
            int day = scanner.nextInt();

            // The switch expression directly assigns the result to dayName
            String dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6, 7 -> "Weekend";
                default -> "Invalid Day";
            };

            System.out.println("Day " + day + " is: " + dayName);
        }
    }
}


//------------------------------------------------------------------------------------------------------
// Grouped Cases in Switch labels
//------------------------------------------------------------------------------------------------------



// import java.util.Scanner;

// public class Demo2 {
//     public static void main(String[] args) {
        
//         try (Scanner scanner = new Scanner(System.in)) {
//             System.out.print("Enter a day number (1-7): ");
//             int dayNumber = scanner.nextInt();

//             String dayType = switch (dayNumber) {
//                 case 1, 2, 3, 4, 5 -> "Weekday";
//                 case 6, 7 -> "Weekend";
//                 default -> "Invalid day";
//             };

//             System.out.println("Day " + dayNumber + " is a: " + dayType);
//         }
//     }
// }