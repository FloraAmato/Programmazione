package esempio3_camera;

/**
 * Classe concreta Segnale. Aggiungerla NON richiede di modificare Camera!
 * Questo e' il punto forte del design con wildcard.
 */
public class Segnale {

    @Override
    public String toString() {
        return "un segnale stradale";
    }
}
