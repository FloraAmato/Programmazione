public class RicercaLineare {
    // ritorna l'indice di chiave in v, oppure -1
    public static int cerca(int[] v, int chiave) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == chiave) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] v = {5, 12, 3, 9, 1, 8};
        System.out.println("9  -> indice " + cerca(v, 9));
        System.out.println("42 -> indice " + cerca(v, 42));
    }
}
