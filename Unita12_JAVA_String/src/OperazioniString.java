public class OperazioniString {
    public static void main(String[] args) {
        String s = "  Ciao Mondo  ";
        System.out.println("originale:    [" + s + "]");
        System.out.println("trim:         [" + s.trim() + "]");
        System.out.println("upper:        " + s.toUpperCase());
        System.out.println("lower:        " + s.toLowerCase());
        System.out.println("length:       " + s.length());
        System.out.println("charAt(2):    " + s.charAt(2));
        System.out.println("indexOf('M'): " + s.indexOf('M'));
        System.out.println("substring:    " + s.trim().substring(5));
        System.out.println("replace:      " + s.replace("Ciao", "Salve"));

        String csv = "uno,due,tre,quattro";
        for (String t : csv.split(",")) {
            System.out.println("token: " + t);
        }
    }
}
