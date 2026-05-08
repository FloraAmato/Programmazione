public class Matrice {
    public static int[][] somma(int[][] a, int[][] b) {
        int n = a.length, m = a[0].length;
        int[][] r = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    public static int[][] trasposta(int[][] a) {
        int n = a.length, m = a[0].length;
        int[][] t = new int[m][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                t[j][i] = a[i][j];
        return t;
    }

    public static void stampa(int[][] m) {
        for (int[] riga : m) {
            for (int x : riga) System.out.printf("%4d", x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{10, 20, 30}, {40, 50, 60}};
        System.out.println("Somma:"); stampa(somma(a, b));
        System.out.println("Trasposta di a:"); stampa(trasposta(a));
    }
}
