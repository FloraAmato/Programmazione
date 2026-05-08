package modulare;

public class TestPersona {
    public static void main(String[] args) {
        Persona p = new Persona("RSSMRA80A01F839X", "Mario", "Rossi");
        p.modificaResidenza("Via Roma 1, Napoli");
        p.stampaDati();
        // Il client non ha visibilita dei campi privati:
        // p.nome NON e' accessibile da qui.
    }
}
