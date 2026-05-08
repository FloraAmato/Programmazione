package it.unina.geometria;

public class Cerchio {
    private final Punto centro;
    private final double raggio;
    public Cerchio(Punto centro, double raggio) {
        this.centro = centro;
        this.raggio = raggio;
    }
    public double area() { return Math.PI * raggio * raggio; }
    public Punto getCentro() { return centro; }
    public double getRaggio() { return raggio; }
}
