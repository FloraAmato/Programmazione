import java.util.Objects;

public class Libro {
    private final String isbn;
    private final String titolo;
    private final String autore;

    public Libro(String isbn, String titolo, String autore) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Libro[" + isbn + ", " + titolo + ", " + autore + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro altro = (Libro) o;
        return Objects.equals(isbn, altro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
