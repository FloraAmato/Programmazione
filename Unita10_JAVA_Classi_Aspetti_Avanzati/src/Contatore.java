public class Contatore {
    private static int istanzeCreate = 0;
    private final int id;

    public Contatore() {
        istanzeCreate++;
        this.id = istanzeCreate;
    }

    public int getId() { return id; }
    public static int getIstanzeCreate() { return istanzeCreate; }
}
