package dominio;

public class Conto {
    private double saldo;
    public Conto(double iniziale) { this.saldo = iniziale; }
    public double getSaldo() { return saldo; }

    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo > saldo) {
            throw new SaldoInsufficienteException(importo - saldo);
        }
        saldo -= importo;
    }
}
