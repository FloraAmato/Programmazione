public class Quadrato {
    public static int quadrato(int i1) {
        System.out.println("[quadrato(int)]");
        return i1 * i1;
    }
    public static double quadrato(double d1) {
        System.out.println("[quadrato(double)]");
        return d1 * d1;
    }
    public static void main(String[] args) {
        System.out.println(quadrato(5));
        System.out.println(quadrato(2.5));
    }
}
