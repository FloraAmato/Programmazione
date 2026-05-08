package dominio;

public class SaldoInsufficienteException extends Exception {
    private final double mancanti;

    public SaldoInsufficienteException(double mancanti) {
        super("Saldo insufficiente: mancano " + mancanti + " euro");
        this.mancanti = mancanti;
    }

    public double getMancanti() { return mancanti; }
}
