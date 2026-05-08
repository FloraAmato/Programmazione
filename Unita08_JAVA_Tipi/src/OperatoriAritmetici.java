public class OperatoriAritmetici {
    public static void main(String[] args) {
        int a = 7, b = 2;
        System.out.println("7 / 2  (int)    = " + (a / b));     // 3
        System.out.println("7 % 2           = " + (a % b));     // 1
        System.out.println("7 / 2  (double) = " + ((double) a / b)); // 3.5

        int x = 5;
        System.out.println("x++ -> " + (x++)); // 5 (post)
        System.out.println("x   -> " + x);     // 6
        System.out.println("++x -> " + (++x)); // 7 (pre)
    }
}
