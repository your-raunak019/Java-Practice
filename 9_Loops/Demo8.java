// Research what continue does inside a loop, and write a for loop that skips printing multiples of 3.

public class Demo8 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++){
           if (i % 3 == 0){
            continue;
           }
           System.out.println(i);
        }
    }
}