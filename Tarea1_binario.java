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

                DecimalB(binario);
                HexadecimalB(binario);

                break;

            case 2:

                System.out.println("dame El numero Decimal: ");
                int decimal = Sc.nextInt();

                BinarioD(decimal);
                HexadecimalD(decimal);

                break;

            case 3:

                System.out.println("dame El numero Hexadecimal: ");
                String Buffer = Sc.nextLine();
                String Hexadecimal = Sc.nextLine();

                BinarioH(Hexadecimal);
                DecimalH(Hexadecimal);

                break;

            default:
                System.out.println("matate");
        }
        Sc.close();
    }

    private static void DecimalB(int numero) {
        /**
         * binario a decimal
         * agarramos el numero de derecha a izquierda, a cada uno lo multiplicamos por
         * 2**(n) donde por cada nuevo numero n = n +1
         **/
        int posicion = 0;
        int SumaTotal = 0;
        int NumeroOR = numero;

        while (numero > 0) {
            int UltDig = numero % 10;

            int cuadrado = (int) Math.pow(2, posicion);
            posicion = posicion + 1;

            int mult = UltDig * cuadrado;

            SumaTotal += mult;

            numero = numero / 10;
        }
        System.out.println("El numero " + NumeroOR + " en decimal es " + SumaTotal);
    }

    // hexadecimal a binario
    private static void BinarioH(String NumHex) {
        // 2D
        int num = 0;
        String Total = "";
        String BancoHexa = "0123456789ABCDEF";

        while (num < NumHex.length()) {
            char posicionHEX = NumHex.charAt(num);
            // decimal a binario
            String resultado = "";
            int LetraBin = BancoHexa.indexOf(posicionHEX);

            while (LetraBin > 0) {

                if (LetraBin % 2 == 0) {
                    resultado = 0 + resultado;
                } else {
                    resultado = 1 + resultado;
                }
                LetraBin = LetraBin / 2;
            }
            int posicionBIN = resultado.length();

            if (posicionBIN < 4 && posicionBIN > 2) {
                resultado = "0" + resultado;
            } else if (posicionBIN < 3) {
                resultado = "00" + resultado;
            }

            Total += resultado;
            num = num + 1;

        }

        System.out.println("el numero " + NumHex + " en hexadecimal es: " + Total);
    }

    private static void BinarioD(int numero) {

        String resultado = "";

        int numeroOR = numero;

        while (numero > 0) {

            if (numero % 2 == 0) {
                resultado = 0 + resultado;
            } else {
                resultado = 1 + resultado;
            }
            numero = numero / 2;
        }
        System.out.println("el " + numeroOR + " en binario es: " + resultado);
    }

    private static void HexadecimalD(int numero) {

        String resultado = "";

        int numeroOR = numero;

        while (numero > 0) {

            int sobrante = (numero % 16);

            if (sobrante >= 10) {

                switch (sobrante) {
                    case 10:
                        resultado = "A" + resultado;
                        break;
                    case 11:
                        resultado = "B" + resultado;
                        break;
                    case 12:
                        resultado = "C" + resultado;
                        break;
                    case 13:
                        resultado = "D" + resultado;
                        break;
                    case 14:
                        resultado = "F" + resultado;
                        break;
                    case 15:
                        resultado = "G" + resultado;
                        break;
                    default:
                        break;
                }

            } else {

                resultado = sobrante + resultado;

            }
            numero = numero / 16;
        }
        System.out.println("el " + numeroOR + " en hexadecimal es: " + resultado);

    }

    private static void HexadecimalB(int numero) {

    }

    private static void DecimalH(String numero) {

    }

}
