public class Cerchio {
    public static final double PI = 3.14159265358979;
    private double raggio;

    public Cerchio() {
        this(1.0); // costruttore di default: cerchio unitario
    }

    public Cerchio(double raggio) {
        if (raggio < 0) raggio = 0;
        this.raggio = raggio;
    }

    public double getRaggio() { return raggio; }
    public void setRaggio(double r) {
        if (r >= 0) this.raggio = r;
    }

    public double area() {
        return PI * raggio * raggio;
    }
    public double circonferenza() {
        return 2 * PI * raggio;
    }
}
