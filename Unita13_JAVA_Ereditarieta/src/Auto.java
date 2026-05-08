public class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String marca, int anno, int porte) {
        super(marca, anno);
        this.numeroPorte = porte;
    }

    @Override
    public void descrivi() {
        super.descrivi();
        System.out.println("  -> Auto a " + numeroPorte + " porte");
    }
}
