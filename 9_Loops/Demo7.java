// Research what break does inside a loop, and write a for loop that stops early once it finds the number 7.



public class Demo7 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++){
           if (i==7){
            break;
           }
           System.out.println(i);
        }
    }
}