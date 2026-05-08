public class Varargs {
    public static int somma(int... nums) {
        int s = 0;
        for (int n : nums) s += n;
        return s;
    }
    public static void main(String[] args) {
        System.out.println(somma());
        System.out.println(somma(1, 2, 3));
        System.out.println(somma(1, 2, 3, 4, 5, 6, 7));
    }
}
