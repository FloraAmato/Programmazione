public abstract class Forma {
    public abstract double area();

    public void stampaArea() {
        System.out.printf("%s -> area = %.2f%n",
                getClass().getSimpleName(), area());
    }
}
