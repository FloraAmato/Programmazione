public class JaggedArray {
    public static void main(String[] args) {
        int[][] j = new int[3][];
        j[0] = new int[]{1};
        j[1] = new int[]{1, 2};
        j[2] = new int[]{1, 2, 3};
        for (int[] r : j) {
            for (int x : r) System.out.print(x + " ");
            System.out.println();
        }
    }
}
