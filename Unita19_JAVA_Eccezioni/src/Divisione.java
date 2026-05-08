import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisione {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("a: ");
            int a = in.nextInt();
            System.out.print("b: ");
            int b = in.nextInt();
            System.out.println("a/b = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Divisione per zero!");
        } catch (InputMismatchException e) {
            System.out.println("Input non valido (atteso un intero)");
        } finally {
            in.close();
            System.out.println("(blocco finally eseguito)");
        }
    }
}
