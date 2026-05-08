import java.util.ArrayList;
import java.util.List;

public class Garage {
    // Aggregazione: il garage non possiede le auto, le contiene.
    private final List<Auto> auto = new ArrayList<>();

    public void parcheggia(Auto a) { auto.add(a); }
    public void liberaTutte() { auto.clear(); } // le Auto continuano ad esistere

    public void stampa() {
        System.out.println("Auto in garage:");
        for (Auto a : auto) {
            System.out.println("  " + a.getTarga() + " ("
                    + a.getCilindrata() + " cc)");
        }
    }
}
