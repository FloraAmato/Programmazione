package esempio2_vincoli;

import java.util.ArrayList;
import java.util.List;

/**
 * ESEMPIO 2 - Vincoli sui tipi generici (bounded type parameters).
 *
 * Mostra due usi tipici di "extends" nei generici:
 *
 *   A) Vincolo multiplo: &lt;T extends Figura &amp; Drawable&gt;
 *      Il tipo T deve essere CONTEMPORANEAMENTE una sottoclasse di Figura
 *      e un'implementazione di Drawable. Notare:
 *         - si usa SEMPRE extends, anche per le interfacce (NON implements)
 *         - la CLASSE va specificata per prima, poi le interfacce
 *         - si combinano con il carattere &amp;
 *
 *   B) Vincolo Comparable: &lt;T extends Comparable&lt;T&gt;&gt;
 *      Garantisce che T abbia il metodo compareTo(): il classico esempio
 *      che permette di scrivere un trovaMassimo() generico.
 */
public class MainVincoli {

    /**
     * Metodo generico con vincolo COMPOSTO.
     * Dentro il metodo posso chiamare sia disegna() (da Drawable)
     * sia area() (da Figura) perche' T garantisce entrambe.
     */
    public static <T extends Figura & Drawable> void disegnaECalcolaArea(T elemento) {
        elemento.disegna();
        System.out.printf("  -> area = %.2f%n", elemento.area());
    }

    /**
     * Metodo generico con vincolo Comparable.
     * Funziona con QUALSIASI tipo che sappia confrontarsi con se stesso.
     */
    public static <T extends Comparable<T>> T trovaMassimo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("lista vuota o null");
        }
        T max = lista.get(0);
        for (T elem : lista) {
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("=== A) Vincolo multiplo: <T extends Figura & Drawable> ===\n");

        Cerchio    c = new Cerchio(5.0);
        Rettangolo r = new Rettangolo(4.0, 6.0);

        disegnaECalcolaArea(c);
        disegnaECalcolaArea(r);

        // String non e' ne' Figura ne' Drawable, quindi il vincolo
        // impedisce di chiamare il metodo con un argomento sbagliato:
        //
        //     disegnaECalcolaArea("ciao");  // <-- NON COMPILA
        //
        // Errore in compilazione, NON a runtime: il bug e' impossibile.

        System.out.println("\n=== B) Vincolo Comparable: trovaMassimo generico ===\n");

        List<Integer> numeri = new ArrayList<>();
        numeri.add(3);
        numeri.add(15);
        numeri.add(7);
        numeri.add(42);
        numeri.add(11);

        Integer maxInt = trovaMassimo(numeri);
        System.out.println("Massimo tra i numeri      : " + maxInt);

        List<String> parole = new ArrayList<>();
        parole.add("banana");
        parole.add("ciliegia");
        parole.add("ananas");
        parole.add("kiwi");

        String maxStr = trovaMassimo(parole);
        System.out.println("Massimo (alfabetico) parole: " + maxStr);

        // Stesso metodo, due tipi diversi, zero duplicazione di codice.
        // Funzionerebbe anche con Double, BigDecimal, LocalDate, ...
        // ovvero qualsiasi tipo che implementa Comparable<se stesso>.
    }
}
