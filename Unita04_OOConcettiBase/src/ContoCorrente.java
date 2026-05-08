/*
 * ContoCorrente: esempio di classe con stato incapsulato.
 * Lo stato (saldo, intestatario) e' privato.
 * Il comportamento e' esposto tramite metodi pubblici.
 */
public class ContoCorrente {
    private String intestatario;
    private double saldo;

    public ContoCorrente(String intestatario, double saldoIniziale) {
        this.intestatario = intestatario;
        this.saldo = saldoIniziale;
    }

    public void versa(double importo) {
        if (importo <= 0) {
            System.out.println("Importo non valido");
            return;
        }
        saldo += importo;
    }

    public boolean preleva(double importo) {
        if (importo <= 0 || importo > saldo) {
            return false;
        }
        saldo -= importo;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getIntestatario() {
        return intestatario;
    }
}
