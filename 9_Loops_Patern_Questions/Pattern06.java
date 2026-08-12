public class Pattern06 {
    public static void main(String[] args) {
        int rows = 5;

        // top half (pyramid)
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // bottom half (inverted pyramid, starting one row smaller)
        for (int i = rows - 1; i >= 1; i--) {
            for (int space = 1; space <= rows - i; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* Output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/