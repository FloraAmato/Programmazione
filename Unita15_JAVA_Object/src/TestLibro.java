import java.util.HashSet;
import java.util.Set;

public class TestLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("978-1", "Promessi Sposi", "Manzoni");
        Libro l2 = new Libro("978-2", "Decameron",      "Boccaccio");
        Libro l3 = new Libro("978-1", "Promessi Sposi - ed. economica", "Manzoni");

        System.out.println(l1);
        System.out.println("l1 == l3 ?      " + (l1 == l3));     // false
        System.out.println("l1.equals(l3)?  " + l1.equals(l3));   // true (stesso ISBN)

        Set<Libro> catalogo = new HashSet<>();
        catalogo.add(l1);
        catalogo.add(l2);
        catalogo.add(l3); // NON viene aggiunto: equals/hashCode lo rendono duplicato
        System.out.println("dimensione set: " + catalogo.size());
    }
}
