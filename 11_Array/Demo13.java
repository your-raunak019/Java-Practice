// Research what a 2D array (array of arrays) is in Java, and create a simple 3x3 grid of int values, printing it row by row.

/*

2D arrays in Java are arrays of arrays, meaning that each element of the main array is itself an array. This allows for the creation of a grid-like structure, where you can access elements using two indices: one for the row and one for the column.

*/

public class Demo13 {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] row : grid) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}