public interface Salvabile {
    void salvaSu(String filename);

    default boolean salvaSeSupportato(String filename) {
        salvaSu(filename);
        return true;
    }
}
