import it.unina.geometria.Cerchio;
import it.unina.geometria.Punto;
import it.unina.util.Stampante;

public class MainPackage {
    public static void main(String[] args) {
        Cerchio c = new Cerchio(new Punto(1, 2), 3);
        Stampante.stampa(c);
    }
}
