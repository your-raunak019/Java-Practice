public class Pattern13 {
    public static void main(String[] args) {
        int rows = 5;

        // top half
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int space = 1; space <= 2 * (rows - i); space++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // bottom half
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int space = 1; space <= 2 * (rows - i); space++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
/* Output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/