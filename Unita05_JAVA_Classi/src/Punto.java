public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public double distanzaDa(Punto altro) {
        double dx = this.x - altro.x;
        double dy = this.y - altro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void stampa() {
        System.out.printf("(%.2f, %.2f)%n", x, y);
    }
}
