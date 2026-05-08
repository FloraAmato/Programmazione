public class TestGeometria {
    public static void main(String[] args) {
        Punto a = new Punto(0, 0);
        Punto b = new Punto(3, 4);
        System.out.println("Distanza A-B: " + a.distanzaDa(b));

        Rettangolo r = new Rettangolo(new Punto(1, 1), new Punto(5, 4));
        System.out.println("Area:      " + r.area());
        System.out.println("Perimetro: " + r.perimetro());
    }
}
