public class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String marca, int anno, int cilindrata) {
        super(marca, anno);
        this.cilindrata = cilindrata;
    }

    @Override
    public void descrivi() {
        super.descrivi();
        System.out.println("  -> Moto da " + cilindrata + " cc");
    }
}
