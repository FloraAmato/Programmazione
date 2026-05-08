public class Documento implements Stampabile, Salvabile {
    private final String titolo;
    private final String corpo;

    public Documento(String titolo, String corpo) {
        this.titolo = titolo;
        this.corpo = corpo;
    }

    @Override
    public void stampa() {
        System.out.println("=== " + titolo + " ===");
        System.out.println(corpo);
    }

    @Override
    public void salvaSu(String filename) {
        System.out.println("Salvo '" + titolo + "' su " + filename);
    }
}
