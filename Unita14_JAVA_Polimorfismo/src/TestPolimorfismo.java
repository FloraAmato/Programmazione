public class TestPolimorfismo {
    public static void main(String[] args) {
        Forma[] forme = {
                new Cerchio(2),
                new Rettangolo(3, 4),
                new Triangolo(5, 6),
        };

        double totale = 0;
        for (Forma f : forme) {
            f.stampaArea();              // dispatch dinamico
            totale += f.area();
        }
        System.out.printf("Area totale: %.2f%n", totale);

        Forma f = forme[0];
        if (f instanceof Cerchio) {
            Cerchio c = (Cerchio) f;
            System.out.println("Era un cerchio: " + c.area());
        }
    }
}
