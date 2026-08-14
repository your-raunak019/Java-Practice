// Write a program that counts how many even numbers are in an int array.

public class Demo12 {
    public static void main(String[] args){
        int[] numbers = {7,2,5,8,4,9,5,3,6,12,21};
        int count = 0;
        for (int num : numbers){
            if(num % 2 == 0){
                count++;
            }
        }
        

        System.out.print("There are " +count +" even numbers in this array.");
       

    }
}