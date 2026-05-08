import java.util.Arrays;

public class OrdinamentoArray {
    public static void main(String[] args) {
        int[] v = {5, 2, 8, 1, 9, 3};
        int[] copia = Arrays.copyOf(v, v.length);

        Arrays.sort(copia);
        System.out.println("originale: " + Arrays.toString(v));
        System.out.println("ordinato:  " + Arrays.toString(copia));

        int idx = Arrays.binarySearch(copia, 8);
        System.out.println("indice di 8 (su ordinato): " + idx);
    }
}
