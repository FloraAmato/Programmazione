public class Costanti {
    public static final double PI_GRECO = 3.14159265358979;
    public static final int MAX_TENTATIVI = 3;

    public static void main(String[] args) {
        System.out.println("Pi greco:      " + PI_GRECO);
        System.out.println("Max tentativi: " + MAX_TENTATIVI);
        // PI_GRECO = 3; // ERRORE: cannot assign a value to final variable
    }
}
