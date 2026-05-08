public class ConfrontiString {
    public static void main(String[] args) {
        String a = "ciao";
        String b = "ciao";
        String c = new String("ciao");

        System.out.println("a == b ? " + (a == b));     // true (string pool)
        System.out.println("a == c ? " + (a == c));     // false
        System.out.println("a.equals(c) ? " + a.equals(c)); // true

        System.out.println("compareTo('mela','pera') = "
                + "mela".compareTo("pera"));
    }
}
