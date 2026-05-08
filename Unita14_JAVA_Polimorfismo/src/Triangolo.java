public class Triangolo extends Forma {
    private double base, altezza;
    public Triangolo(double b, double h) {
        this.base = b; this.altezza = h;
    }
    @Override
    public double area() { return 0.5 * base * altezza; }
}
