public class StringBuilderDemo {
    public static void main(String[] args) {
        final int N = 50_000;

        long t1 = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) s += "x"; // crea N stringhe
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append("x");
        String s2 = sb.toString();
        long t4 = System.nanoTime();

        System.out.printf("String + :       %d ms%n", (t2 - t1) / 1_000_000);
        System.out.printf("StringBuilder:   %d ms%n", (t4 - t3) / 1_000_000);
        System.out.println("uguali? " + s.equals(s2));
    }
}
