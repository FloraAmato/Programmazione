/*
 * Unita 0 - Programma di benvenuto.
 * Verifica che la JDK sia installata e funzionante.
 */
public class Benvenuto {
    public static void main(String[] args) {
        System.out.println("Benvenuti al Corso di Programmazione!");
        System.out.println("Versione Java: " + System.getProperty("java.version"));
        System.out.println("Sistema operativo: " + System.getProperty("os.name"));
    }
}
