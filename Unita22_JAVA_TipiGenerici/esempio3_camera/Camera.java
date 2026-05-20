package esempio3_camera;

/**
 * Classe Camera: usa la WILDCARD '?' per accettare un Ostacolo&lt;qualunque tipo&gt;
 * con UN SOLO metodo.
 *
 * Senza la wildcard saremmo costretti a scrivere un metodo per ogni tipo
 * concreto (uno per Bici, uno per Pedone, uno per Segnale, ...).
 * Con Ostacolo&lt;?&gt; il metodo e' UNO solo e funziona per qualsiasi T.
 */
public class Camera {

    public void riconosciOstacolo(Ostacolo<?> ostacolo) {
        System.out.println("Ho riconosciuto " + ostacolo.getTipoOstacolo());
    }
}
