import java.util.Scanner;

public class Tarea1_binario {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Selecciona un sistema numerico:\n");
        System.out.println("1. Binario");
        System.out.println("\n2. Decimal");
        System.out.println("\n3. Hexadecimal");
        int opcion = Sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("dame El numero binario: ");
                int binario = Sc.nextInt();

                Decimal();
                Hexadecimal();

                break;

            case 2:

                System.out.println("dame El numero Decimal: ");
                int decimal = Sc.nextInt();

                Decimal();
                Hexadecimal();

                break;

            case 3:

                System.out.println("dame El numero Hexadecimal: ");
                int Hexadecimal = Sc.nextInt();

                Binario();
                Decimal();

                break;

            default:
                System.out.println("matate");
        }
        Sc.close();
    }

    private static void Binario() {

    }

    private static void Decimal() {

        for (int i = opcion; i >= 1; i++) {

        }

    }

    private static void Hexadecimal() {

    }
}
