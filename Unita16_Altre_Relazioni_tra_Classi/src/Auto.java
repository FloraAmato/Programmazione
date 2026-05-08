public class Auto {
    private final String targa;
    private final Motore motore;     // composizione: creato qui
    private final Ruota[] ruote;     // composizione

    public Auto(String targa, int cilindrata) {
        this.targa = targa;
        this.motore = new Motore(cilindrata);
        this.ruote = new Ruota[]{
                new Ruota(15), new Ruota(15),
                new Ruota(15), new Ruota(15)};
    }

    public String getTarga() { return targa; }
    public int getCilindrata() { return motore.getCilindrata(); }
}
