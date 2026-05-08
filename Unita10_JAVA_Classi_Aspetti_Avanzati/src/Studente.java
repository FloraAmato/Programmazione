public class Studente {
    private String nome;
    private String matricola;
    private int crediti;

    public Studente() {
        this("Sconosciuto", "000000");
    }

    public Studente(String nome, String matricola) {
        this(nome, matricola, 0);
    }

    public Studente(String nome, String matricola, int crediti) {
        this.nome = nome;
        this.matricola = matricola;
        this.crediti = crediti;
    }

    public void stampa() {
        System.out.println(matricola + " - " + nome
                + " (CFU: " + crediti + ")");
    }
}
