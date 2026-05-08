public class ConversioniTipo {
    public static void main(String[] args) {
        // widening (automatica)
        int i = 100;
        long l = i;
        double d = l;
        System.out.println("i=" + i + ", l=" + l + ", d=" + d);

        // narrowing (cast esplicito)
        double pi = 3.14159;
        int troncato = (int) pi;          // 3
        System.out.println("troncato = " + troncato);

        int grande = 130;
        byte b = (byte) grande;            // overflow -> -126
        System.out.println("byte di 130 = " + b);

        char c = 'A';
        int codice = c;                    // 65
        System.out.println("'A' come int = " + codice);
    }
}
