public class Rettangolo {
    private Punto inBassoSx;
    private Punto inAltoDx;

    public Rettangolo(Punto inBassoSx, Punto inAltoDx) {
        this.inBassoSx = inBassoSx;
        this.inAltoDx = inAltoDx;
    }

    public double base() {
        return inAltoDx.getX() - inBassoSx.getX();
    }

    public double altezza() {
        return inAltoDx.getY() - inBassoSx.getY();
    }

    public double area() {
        return base() * altezza();
    }

    public double perimetro() {
        return 2 * (base() + altezza());
    }
}
