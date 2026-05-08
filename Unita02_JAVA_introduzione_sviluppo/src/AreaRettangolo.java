import java.util.Scanner;

public class AreaRettangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base (double): ");
        double base = input.nextDouble();
        System.out.print("Altezza (double): ");
        double altezza = input.nextDouble();
        double area = base * altezza;
        System.out.printf("Area = %.2f%n", area);
        input.close();
    }
}
