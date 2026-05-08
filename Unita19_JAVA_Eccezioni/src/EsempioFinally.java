public class EsempioFinally {
    public static int test(boolean lancia) {
        try {
            if (lancia) throw new RuntimeException("boom");
            return 1;
        } catch (RuntimeException e) {
            System.out.println("catch: " + e.getMessage());
            return 2;
        } finally {
            System.out.println("finally eseguito");
        }
    }
    public static void main(String[] args) {
        System.out.println("ret = " + test(false));
        System.out.println("---");
        System.out.println("ret = " + test(true));
    }
}
