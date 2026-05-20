package esempio2_vincoli;

/**
 * Rettangolo: anche questa classe estende Figura e implementa Drawable.
 */
public class Rettangolo extends Figura implements Drawable {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public void disegna() {
        System.out.println("[Rettangolo] disegno un rettangolo " + base + " x " + altezza);
    }
}
