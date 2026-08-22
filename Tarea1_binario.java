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

                Decimal(binario);
                Hexadecimal(binario);

                break;

            case 2:

                System.out.println("dame El numero Decimal: ");
                int decimal = Sc.nextInt();

                Binario(decimal);
                Hexadecimal(decimal);

                break;

            case 3:

                System.out.println("dame El numero Hexadecimal: ");
                int Hexadecimal = Sc.nextInt();

                Binario(Hexadecimal);
                Decimal(Hexadecimal);

                break;

            default:
                System.out.println("matate");
        }
        Sc.close();
    }

    private static void Binario(int numero) {

        String resultado = "" ;

        int numeroOR = numero;

        while(numero > 0){
            
            if(numero % 2 == 0){
                resultado = 0 + resultado;
            }else{
                resultado = 1 + resultado;
            }
            numero = numero / 2;
        }
        System.out.println("el "+numeroOR+" en binario es: "+ resultado);
    }

    private static void Decimal(int numero) {
            // Convertir de decimal a binario y hexadecimal
            /**decimal a binario
             * agarramos el numero de derecha a izquierda, a cada uno lo multiplicamos por 2**(n) donde por cada nuevo numero n = n +1**/
        String resultado = "";
            //0001
            int residuo = numero % 10;
            int posicion = 0;

        while(numero > 0){
            
        }


    }

    private static void Hexadecimal(int numero) {
        
        String resultado = "";
        
        int numeroOR = numero;


        while(numero > 0){
            
            int sobrante = (numero % 16);

            if(sobrante >= 10){

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

            }else{

                resultado = sobrante + resultado;

            }
            numero = numero / 16;  
        }
            System.out.println("el "+ numeroOR +" en hexadecimal es: " + resultado); 

    }
}
