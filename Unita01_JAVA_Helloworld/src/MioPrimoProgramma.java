/*
 * Esempio che mostra la differenza tra print e println
 * e l'uso della concatenazione di stringhe con +.
 */
public class MioPrimoProgramma {
    public static void main(String[] args) {
        System.out.print("Questa stampa ");
        System.out.print("non va a capo. ");
        System.out.println("Adesso si.");
        int anno = 2026;
        System.out.println("Siamo nell'anno " + anno + ".");
    }
}
