public class TestContatore {
    public static void main(String[] args) {
        Contatore a = new Contatore();
        Contatore b = new Contatore();
        Contatore c = new Contatore();
        System.out.println("a.id = " + a.getId());
        System.out.println("b.id = " + b.getId());
        System.out.println("c.id = " + c.getId());
        System.out.println("istanze totali: " + Contatore.getIstanzeCreate());
    }
}
