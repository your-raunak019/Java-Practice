// Create two boolean variables and print the result of combining them with ||.
public class Demo3 {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        boolean canRelax = isWeekend || isHoliday;
        
        System.out.println("Can relax: " + canRelax);
    }
}
