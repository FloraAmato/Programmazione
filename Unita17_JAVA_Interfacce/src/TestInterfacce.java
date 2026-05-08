public class TestInterfacce {
    public static void main(String[] args) {
        Documento d = new Documento("Titolo", "Contenuto del documento");
        Stampabile s = d;
        Salvabile sa = d;
        s.stampa();
        sa.salvaSu("/tmp/doc.txt");
        sa.salvaSeSupportato("/tmp/backup.txt");
    }
}
