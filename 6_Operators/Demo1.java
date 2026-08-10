public class Demo1 {
    public static void main(String[] args) {
        int age = 20;
        boolean citizenOfIndia = true;
        
        boolean isEligibleForVote = age >= 18 && citizenOfIndia == true;
        
        System.out.println("Is Eligible For Vote: " +isEligibleForVote);
    }
    
}