package esempio3_camera;

import java.util.ArrayList;
import java.util.List;

/**
 * ESEMPIO 3 - Wildcard '?' nei tipi generici.
 *
 * Caso d'uso: una camera per veicoli a guida autonoma che deve riconoscere
 * ostacoli di tipo qualunque (pedoni, bici, segnali, e potenzialmente
 * nuovi tipi futuri come monopattini, droni delivery, ecc.).
 *
 * Mostra:
 *   1) Uso di Ostacolo&lt;?&gt; come parametro per accettare qualsiasi tipo.
 *   2) La REGOLA D'ORO delle wildcard: si puo' LEGGERE ma non SCRIVERE.
 *   3) L'estendibilita': aggiungere un nuovo tipo non richiede modifiche
 *      alla classe Camera.
 */
public class MainCamera {

    public static void main(String[] args) {

        System.out.println("=== Camera che riconosce ostacoli di tipo qualunque ===\n");

        // Ostacoli concreti di tre tipi DIVERSI.
        Ostacolo<Pedone>  o1 = new Ostacolo<>(new Pedone());
        Ostacolo<Bici>    o2 = new Ostacolo<>(new Bici());
        Ostacolo<Segnale> o3 = new Ostacolo<>(new Segnale());

        // UN SOLO metodo riconosciOstacolo() li gestisce tutti.
        Camera videoCamera = new Camera();
        videoCamera.riconosciOstacolo(o1);
        videoCamera.riconosciOstacolo(o2);
        videoCamera.riconosciOstacolo(o3);

        System.out.println("\n=== Regola d'oro: con '?' si legge, non si scrive ===\n");

        // Una List<?> puo' contenere elementi di qualunque tipo,
        // ma proprio per questo Java NON ci lascia inserire nulla
        // (eccetto null), perche' non sa quale tipo accettare.

        List<String> stringhe = new ArrayList<>();
        stringhe.add("alfa");
        stringhe.add("beta");

        List<?> mistera = stringhe;  // OK: una List<String> e' una List<?>

        // LETTURA: OK. Otteniamo un Object, perche' non sappiamo il tipo esatto.
        Object x = mistera.get(0);
        System.out.println("Letto da mistera[0]: " + x);

        // SCRITTURA: VIETATA dal compilatore!
        // Decommentando una delle righe sotto si ottiene errore di compilazione:
        //
        //     mistera.add("ciao");      // NON COMPILA: che tipo e' "?" ?
        //     mistera.add(42);          // NON COMPILA
        //     mistera.add(new Object()); // NON COMPILA
        //
        // L'unica eccezione e' null, che e' compatibile con qualsiasi riferimento:
        //
        //     mistera.add(null);         // <-- questo compila (ma e' raramente utile)

        System.out.println("\n=== Estendibilita': nuovi tipi senza toccare Camera ===\n");

        // Se domani arriva una nuova classe (es. Monopattino), basta crearla
        // e Camera continua a funzionare senza nessuna modifica. Apriamo
        // il codice all'estensione, lo chiudiamo alla modifica.
        Ostacolo<Object> generico = new Ostacolo<>("un drone delivery");
        videoCamera.riconosciOstacolo(generico);
    }
}
