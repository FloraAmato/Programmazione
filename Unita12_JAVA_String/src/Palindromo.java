public class Palindromo {
    public static boolean palindromo(String s) {
        String pulita = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = pulita.length() - 1;
        while (i < j) {
            if (pulita.charAt(i) != pulita.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] casi = {"anna", "mamma", "I topi non avevano nipoti", "ciao"};
        for (String s : casi) {
            System.out.println("\"" + s + "\" -> " + palindromo(s));
        }
    }
}
