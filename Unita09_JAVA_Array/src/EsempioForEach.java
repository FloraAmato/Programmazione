public class EsempioForEach {
    public static void main(String[] args) {
        String[] giorni = {"Lun", "Mar", "Mer", "Gio", "Ven", "Sab", "Dom"};

        System.out.println("--- for classico ---");
        for (int i = 0; i < giorni.length; i++) {
            System.out.println(i + ": " + giorni[i]);
        }

        System.out.println("--- for-each ---");
        for (String g : giorni) {
            System.out.println(g);
        }
    }
}
