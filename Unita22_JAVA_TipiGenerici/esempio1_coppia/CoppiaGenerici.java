package esempio1_coppia;

/**
 * Classe generica con DUE parametri di tipo: T e S.
 *
 * I parametri si separano con la virgola fra parentesi angolari.
 * Cosi' i due elementi della coppia possono essere di tipi diversi
 * (es. nome e eta', id e misura, ecc.).
 *
 * Convenzioni di naming:
 *   - T  -> Type (primo parametro)
 *   - S  -> Secondo tipo (oppure U, V...)
 *   - E  -> Element (collezioni)
 *   - K, V -> Key, Value (mappe)
 */
public class CoppiaGenerici<T, S> {

    private T primo;
    private S secondo;

    public CoppiaGenerici(T primo, S secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public T getPrimo() {
        return primo;
    }

    public S getSecondo() {
        return secondo;
    }

    @Override
    public String toString() {
        return "(" + primo + ", " + secondo + ")";
    }
}
