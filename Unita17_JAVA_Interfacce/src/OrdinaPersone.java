import java.util.Arrays;
import java.util.Comparator;

public class OrdinaPersone {
    static class Persona implements Comparable<Persona> {
        String nome; int eta;
        Persona(String nome, int eta) { this.nome = nome; this.eta = eta; }
        @Override public int compareTo(Persona o) {
            return this.nome.compareTo(o.nome); // ordine naturale: nome
        }
        @Override public String toString() { return nome + "(" + eta + ")"; }
    }

    public static void main(String[] args) {
        Persona[] p = {
                new Persona("Carlo", 30),
                new Persona("Anna", 25),
                new Persona("Bruno", 40),
        };
        Arrays.sort(p);
        System.out.println("per nome: " + Arrays.toString(p));

        Arrays.sort(p, Comparator.comparingInt(x -> x.eta));
        System.out.println("per eta:  " + Arrays.toString(p));
    }
}
