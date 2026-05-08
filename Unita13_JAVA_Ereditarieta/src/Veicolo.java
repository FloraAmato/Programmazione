public class Veicolo {
    protected String marca;
    protected int annoImmatricolazione;

    public Veicolo(String marca, int anno) {
        this.marca = marca;
        this.annoImmatricolazione = anno;
    }

    public void descrivi() {
        System.out.println("Veicolo " + marca + " (" + annoImmatricolazione + ")");
    }
}
