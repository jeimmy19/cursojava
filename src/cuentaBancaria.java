import javax.swing.*;
import java.util.Scanner;
import  java.util.Random;

public class cuentaBancaria {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cliente = "Tony Stark";
        float saldo = 2000;
        String tipoDeCuenta= "Corriente";
        boolean i;

        while (i=true){
            System.out.println("Menu de Opciones disponible para usar en el Sistema: ");
            System.out.println("1. Consultar saldo. ");
            System.out.println("2. Retirar saldo. ");
            System.out.println("3. Depositar saldo. ");
            System.out.println("4. Salir del sistema. ");
            System.out.println("************************************************************************************");

            System.out.println("Introduzca la opcion que desea realizar: ");
            int opcion = lector.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Su saldo disponible en la cuenta es:"+saldo+"$");
                    break;

                case 2:
                    System.out.println("Introduzca monto a retirar de la cuenta: ");
                    float retiro = lector.nextInt();
                    if(retiro>saldo){
                        System.out.println("Saldo insuficiente: ");
                        break;
                    } else {
                        saldo -= retiro;
                        System.out.println("Su saldo disponible en la cuenta es:"+saldo+"$");
                        break;

                    }


                case 3:
                    System.out.println("Introduzca monto a depositar: ");
                    float deposito = lector.nextInt();
                     saldo += deposito;
                    System.out.println("Su saldo disponible en la cuenta es:"+saldo+"$");
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema.");
                    i=false;
                    return;


            }
        }
    }
}
