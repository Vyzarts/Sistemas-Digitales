package Tarea1_binario;

import java.util.Scanner;

public class Tarea1_binario {

    public static void main(String[] args){
                Scanner Sc = new Scanner(System.in);

        System.out.println("Selecciona un sistema numerico:\n");
        System.out.println("1. Binario");
        System.out.println("\n2. Decimal");
        System.out.println("\n3. Hexadecimal");

        int opcion =  Sc.nextInt();


        switch(opcion){
            case 1:
                Binario();
            break;

            case 2:
                Decimal();
            break;

            case 3:
                Hexadecimal();
            break;

            default:
                System.out.println("matate");
        }
    }

    private static void Binario(){

    }

    private static void Decimal(){
        
    }

    private static void Hexadecimal(){

    }
}
