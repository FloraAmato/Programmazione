public class PassaggioParametri {

    public static void perValore(int i) {
        System.out.println("[dentro perValore] i vale " + i);
        i = 99;
        System.out.println("[dentro perValore] modificato a " + i);
    }

    // Java NON ha passaggio per riferimento per i tipi primitivi.
    // Ma per gli array (oggetti) si puo' modificare il contenuto.
    public static void modificaArray(int[] v) {
        if (v.length > 0) v[0] = -1;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("prima: x = " + x);
        perValore(x);
        System.out.println("dopo:  x = " + x); // x e' ancora 10

        int[] a = {1, 2, 3};
        modificaArray(a);
        System.out.println("a[0] = " + a[0]); // -1
    }
}
