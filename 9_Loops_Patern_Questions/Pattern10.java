public class Pattern10 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                char letter = (char) ('A' + j);
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
/* Output:
A
AB
ABC
ABCD
ABCDE
*/