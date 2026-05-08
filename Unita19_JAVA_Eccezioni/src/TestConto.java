import dominio.Conto;
import dominio.SaldoInsufficienteException;

public class TestConto {
    public static void main(String[] args) {
        Conto c = new Conto(100);
        try {
            c.preleva(40);
            System.out.println("dopo prelievo: " + c.getSaldo());
            c.preleva(200); // lancia
        } catch (SaldoInsufficienteException e) {
            System.out.println("ECCEZIONE: " + e.getMessage());
            System.out.println("Mancanti: " + e.getMancanti());
        }
    }
}
