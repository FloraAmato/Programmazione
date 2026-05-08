public class Agenda {
    private static final int MAX = 100;
    private Contatto[] contatti = new Contatto[MAX];
    private int dimensione = 0;

    public boolean aggiungi(Contatto c) {
        if (dimensione >= MAX) return false;
        contatti[dimensione++] = c;
        return true;
    }

    public Contatto cerca(String nome) {
        for (int i = 0; i < dimensione; i++) {
            if (contatti[i].getNome().equalsIgnoreCase(nome)) {
                return contatti[i];
            }
        }
        return null;
    }

    public void stampaTutti() {
        for (int i = 0; i < dimensione; i++) {
            contatti[i].stampa();
        }
    }
}
