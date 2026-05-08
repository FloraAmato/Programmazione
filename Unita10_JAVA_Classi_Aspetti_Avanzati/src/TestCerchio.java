public class TestCerchio {
    public static void main(String[] args) {
        Cerchio c1 = new Cerchio();
        Cerchio c2 = new Cerchio(2.5);

        System.out.printf("c1: raggio=%.2f, area=%.2f%n",
                c1.getRaggio(), c1.area());
        System.out.printf("c2: raggio=%.2f, area=%.2f%n",
                c2.getRaggio(), c2.area());

        c1.setRaggio(5);
        System.out.printf("c1 nuova area: %.2f%n", c1.area());
    }
}
