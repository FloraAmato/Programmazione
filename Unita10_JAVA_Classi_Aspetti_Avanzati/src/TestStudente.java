public class TestStudente {
    public static void main(String[] args) {
        new Studente().stampa();
        new Studente("Anna", "M1234").stampa();
        new Studente("Luca", "M5678", 60).stampa();
    }
}
