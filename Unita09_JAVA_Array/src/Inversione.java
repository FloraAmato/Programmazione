public class Inversione {
    public static void inverti(int[] v) {
        int i = 0, j = v.length - 1;
        while (i < j) {
            int tmp = v[i];
            v[i] = v[j];
            v[j] = tmp;
            i++; j--;
        }
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5};
        inverti(v);
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }
}
