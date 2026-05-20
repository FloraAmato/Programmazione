package esempio1_coppia;

/**
 * Classe generica Coppia&lt;T&gt;: contiene DUE elementi dello STESSO tipo T.
 *
 * Il parametro di tipo T viene dichiarato fra parentesi angolari dopo
 * il nome della classe. Da quel momento, dentro la classe, T puo' essere
 * usato come un qualsiasi tipo (in campi, parametri, valori di ritorno).
 */
public class Coppia<T> {

    private T primo;
    private T secondo;

    public Coppia(T primo, T secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public T getPrimo() {
        return primo;
    }

    public T getSecondo() {
        return secondo;
    }

    public void setPrimo(T primo) {
        this.primo = primo;
    }

    public void setSecondo(T secondo) {
        this.secondo = secondo;
    }

    @Override
    public String toString() {
        return "(" + primo + ", " + secondo + ")";
    }
}
