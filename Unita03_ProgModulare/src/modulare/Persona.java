package modulare;

/*
 * ADT Persona: i campi sono privati (information hiding),
 * l'accesso e' possibile solo attraverso i metodi pubblici
 * (interfaccia del modulo).
 */
public class Persona {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private String residenza;

    public Persona(String cf, String nome, String cognome) {
        this.codiceFiscale = cf;
        this.nome = nome;
        this.cognome = cognome;
        this.residenza = "";
    }

    public void modificaResidenza(String nuovaResidenza) {
        this.residenza = nuovaResidenza;
    }

    public void stampaDati() {
        System.out.println("CF:        " + codiceFiscale);
        System.out.println("Nome:      " + nome);
        System.out.println("Cognome:   " + cognome);
        System.out.println("Residenza: " + residenza);
    }
}
