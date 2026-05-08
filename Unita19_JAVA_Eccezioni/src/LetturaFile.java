import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetturaFile {
    public static void main(String[] args) {
        String path = args.length > 0 ? args[0] : "README.md";
        // try-with-resources: chiude automaticamente il reader
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String riga;
            int n = 1;
            while ((riga = br.readLine()) != null) {
                System.out.printf("%3d: %s%n", n++, riga);
            }
        } catch (IOException e) {
            System.out.println("Errore di I/O: " + e.getMessage());
        }
    }
}
