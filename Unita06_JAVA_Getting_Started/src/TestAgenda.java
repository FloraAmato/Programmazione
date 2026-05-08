public class TestAgenda {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.aggiungi(new Contatto("Mario Rossi", "081-1111111"));
        a.aggiungi(new Contatto("Anna Bianchi", "081-2222222"));
        a.aggiungi(new Contatto("Luigi Verdi", "081-3333333"));

        System.out.println("--- Tutti i contatti ---");
        a.stampaTutti();

        System.out.println("--- Cerco 'Anna Bianchi' ---");
        Contatto trovato = a.cerca("Anna Bianchi");
        if (trovato != null) trovato.stampa();
        else System.out.println("Non trovato");
    }
}
