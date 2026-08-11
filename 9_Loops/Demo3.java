// Write a for loop that adds up the numbers from 1 to 100 and prints the total.

public class Demo3 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 100; i++) {
            total += i;
        }

        System.out.println("The total sum of numbers from 1 to 100 is: " + total);
    }
}



///another way to write the same code:///

//1. By using a while loop instead of a for loop, we can achieve the same result.
/*

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;

        while (i <= 100) {
            total += i;
            i++;
        }

        System.out.println("The total sum of numbers from 1 to 100 is: " + total);
    }
}

*/

//2. By using a do-while loop instead of a for loop, we can achieve the same result.
/*

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;

        do {
            total += i;
            i++;
        } while (i <= 100);

        System.out.println("The total sum of numbers from 1 to 100 is: " + total);
    }
}

*/