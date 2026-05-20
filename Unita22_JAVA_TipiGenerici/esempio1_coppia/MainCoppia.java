package esempio1_coppia;

/**
 * ESEMPIO 1 - Classi generiche di base.
 *
 * Mostra:
 *   1) La stessa classe Coppia&lt;T&gt; usata con tipi diversi (type-safety).
 *   2) L'inferenza automatica del tipo con il diamante &lt;&gt;.
 *   3) La classe CoppiaGenerici&lt;T, S&gt; con due parametri di tipo.
 *
 * Per eseguire: tasto destro sul file -> "Run Java" oppure F5 in VS Code.
 */
public class MainCoppia {

    public static void main(String[] args) {

        System.out.println("=== Coppia<T>: un solo parametro di tipo ===\n");

        // Stessa classe Coppia, tre tipi concreti diversi.
        // Notare il diamante <> a destra: il tipo viene INFERITO dal compilatore.
        Coppia<Integer> coppiaInt    = new Coppia<>(10, 20);
        Coppia<String>  coppiaStr    = new Coppia<>("ciao", "mondo");
        Coppia<Double>  coppiaDouble = new Coppia<>(3.14, 2.71);

        System.out.println("Coppia<Integer>: " + coppiaInt);
        System.out.println("Coppia<String> : " + coppiaStr);
        System.out.println("Coppia<Double> : " + coppiaDouble);

        // Type-safety a tempo di COMPILAZIONE.
        // Decommentando la riga sotto si ottiene errore di compilazione,
        // perche' coppiaInt accetta solo Integer:
        //
        //     coppiaInt.setPrimo("testo");  // <-- NON COMPILA
        //
        // Questo e' il vantaggio principale dei generici rispetto a usare Object.

        System.out.println("\n=== CoppiaGenerici<T, S>: due parametri di tipo ===\n");

        // T = String (nome), S = Integer (eta')
        CoppiaGenerici<String, Integer> studente =
                new CoppiaGenerici<>("Mario Rossi", 28);

        // T = Integer (id misurazione), S = Double (valore)
        CoppiaGenerici<Integer, Double> misura =
                new CoppiaGenerici<>(4, 5.5);

        System.out.println("Studente (nome, eta) : " + studente);
        System.out.println("Misura   (id, valore): " + misura);

        // I getter restituiscono il tipo CONCRETO, non Object: niente cast!
        String nome = studente.getPrimo();
        int    eta  = studente.getSecondo();  // unboxing automatico da Integer

        System.out.println("\nLo studente " + nome + " ha " + eta + " anni.");
    }
}
