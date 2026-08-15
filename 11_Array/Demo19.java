// Write a program that counts how many times a specific value appears in an int array.

public class Demo19 {
    public static void main(String [] args){

        int [] numbers = {2,5,7,3,9,2,3,5,12,4,3,2,6,8,3,};

        int targetValue = 3;
        int count = 0;

        for(int num : numbers){
            if(num == targetValue){
                count++;
            }
        }

        System.out.println("The value " + targetValue + " appears " + count + " times in the array.");
    }
}

// Output:-

/*
The value 3 appears 4 times in the array.
*/
