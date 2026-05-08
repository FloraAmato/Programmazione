public class Cerchio extends Forma {
    private double raggio;
    public Cerchio(double r) { this.raggio = r; }
    @Override
    public double area() { return Math.PI * raggio * raggio; }
}
