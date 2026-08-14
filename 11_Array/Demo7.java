// Merging two arrays into one

public class Demo7 {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {4, 5, 6, 7};

        int[] merged = new int[first.length + second.length];

        int index = 0;
        for (int n : first) {
            merged[index] = n;
            index++;
        }
        for (int n : second) {
            merged[index] = n;
            index++;
        }

        for (int n : merged) {
            System.out.print(n + " ");
        }
    }
}
/* Output:
1 2 3 4 5 6 7
*/