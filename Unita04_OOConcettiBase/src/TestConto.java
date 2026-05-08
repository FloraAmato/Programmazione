public class TestConto {
    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente("Mario Rossi", 1000);
        ContoCorrente c2 = new ContoCorrente("Anna Bianchi", 500);

        c1.versa(250);
        c2.preleva(100);

        System.out.printf("%s ha %.2f euro%n",
                c1.getIntestatario(), c1.getSaldo());
        System.out.printf("%s ha %.2f euro%n",
                c2.getIntestatario(), c2.getSaldo());

        boolean ok = c2.preleva(10000);
        System.out.println("Prelievo eccessivo riuscito? " + ok);
    }
}
