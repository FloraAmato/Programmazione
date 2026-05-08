import java.util.Scanner;

public class SommaDueNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il primo numero intero: ");
        int a = input.nextInt();
        System.out.print("Inserisci il secondo numero intero: ");
        int b = input.nextInt();
        System.out.println("La somma e' " + (a + b));
        input.close();
    }
}
