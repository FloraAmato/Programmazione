public class TestRelazioni {
    public static void main(String[] args) {
        Auto a1 = new Auto("AB123CD", 1200);
        Auto a2 = new Auto("EF456GH", 2000);

        Garage g = new Garage();
        g.parcheggia(a1);
        g.parcheggia(a2);
        g.stampa();

        g.liberaTutte();
        // a1 e a2 esistono ancora (aggregazione, non composizione)
        System.out.println("a1 esiste ancora: " + a1.getTarga());
    }
}
