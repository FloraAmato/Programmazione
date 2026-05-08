import java.util.ArrayList;

public class Wrappers {
    public static void main(String[] args) {
        Integer i = 5;          // autoboxing int -> Integer
        int j = i;              // unboxing
        System.out.println("i=" + i + ", j=" + j);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1); lista.add(2); lista.add(3); // autoboxing
        int somma = 0;
        for (int x : lista) somma += x;          // unboxing
        System.out.println("somma = " + somma);

        System.out.println("parseInt('42')   = " + Integer.parseInt("42"));
        System.out.println("Integer.MAX      = " + Integer.MAX_VALUE);
    }
}
