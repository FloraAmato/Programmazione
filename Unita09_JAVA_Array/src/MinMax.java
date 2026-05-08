public class MinMax {
    public static void main(String[] args) {
        int[] v = {7, 2, 9, 4, 11, 6};
        int min = v[0], max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < min) min = v[i];
            if (v[i] > max) max = v[i];
        }
        System.out.println("min = " + min + ", max = " + max);
    }
}
