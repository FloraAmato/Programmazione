public class Rettangolo extends Forma {
    private double base, altezza;
    public Rettangolo(double b, double h) {
        this.base = b; this.altezza = h;
    }
    @Override
    public double area() { return base * altezza; }
}
