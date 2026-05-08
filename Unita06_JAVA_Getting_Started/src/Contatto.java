public class Contatto {
    private String nome;
    private String telefono;

    public Contatto(String nome, String telefono) {
        this.nome = nome;
        this.telefono = telefono;
    }

    public String getNome() { return nome; }
    public String getTelefono() { return telefono; }

    public void stampa() {
        System.out.println(nome + " -> " + telefono);
    }
}
