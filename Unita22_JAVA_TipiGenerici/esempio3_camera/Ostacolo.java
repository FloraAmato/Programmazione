package esempio3_camera;

/**
 * Classe generica Ostacolo&lt;T&gt;: incapsula un qualsiasi oggetto T
 * e lo "presenta" come ostacolo.
 *
 * Notare il design: NON abbiamo dovuto modificare Bici, Pedone o Segnale
 * per farli "diventare" ostacoli. Li abbiamo incapsulati in una struttura
 * generica esterna. E' un approccio meno invasivo dell'ereditarieta',
 * particolarmente utile con classi di librerie che non possiamo modificare.
 */
public class Ostacolo<T> {

    private final T tipologia;

    public Ostacolo(T t) {
        this.tipologia = t;
    }

    public T getTipoOstacolo() {
        return tipologia;
    }
}
