public class EsempioOverloading {
    static void stampa(int x) {
        System.out.println("int:    " + x);
    }
    static void stampa(double x) {
        System.out.println("double: " + x);
    }

    public static void main(String[] args) {
        char c = 'A';      // 'A' = 65
        stampa(c);          // char -> int -> stampa(int)
        stampa(3.14f);      // float -> double -> stampa(double)
        stampa(42);         // stampa(int)
        stampa(2.71);       // stampa(double)
    }
}
