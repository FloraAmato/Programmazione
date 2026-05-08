import java.util.Scanner;

public class CalcoloFattoriale {

    public static double Fattoriale(int num) {
        double fatt = 1;
        if (num == 0 || num == 1) {
            fatt = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                fatt = fatt * i;
            }
        }
        return fatt;
    }

    public static void main(String[] args) {
        int n;
        double ris;
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero positivo: ");
        n = input.nextInt();
        if (n < 0) {
            System.out.println("il fattoriale non e' definito per numeri negativi!");
        } else {
            ris = Fattoriale(n);
            System.out.println(n + "! = " + ris);
        }
        input.close();
    }
}
