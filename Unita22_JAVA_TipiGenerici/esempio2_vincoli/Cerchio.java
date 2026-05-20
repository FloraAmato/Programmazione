package esempio2_vincoli;

/**
 * Cerchio: estende Figura (per area) e implementa Drawable (per disegna).
 * Soddisfa quindi il vincolo &lt;T extends Figura &amp; Drawable&gt;.
 */
public class Cerchio extends Figura implements Drawable {

    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double area() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public void disegna() {
        System.out.println("[Cerchio] disegno un cerchio di raggio " + raggio);
    }
}
