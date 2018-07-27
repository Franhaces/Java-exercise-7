package actividad02;

import java.util.Scanner;

/**
 * @author franh
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        System.out.println("Dime dos numeros decimales y te dividiré el primero por el segundo");

        Scanner teclado = new Scanner(System.in); //necesario para leer del teclado

        System.out.println("Dime el primer número. ");
        double num1 = teclado.nextDouble();//convierte a numerico para poder operar;

        System.out.println("Ahora dime otro número, que no sea 0.  ");
        double num2 = teclado.nextDouble();//convierte a numerico para poder operar

        while (num2 == 0) {
            System.out.print("Dime un número distinto de 0!!: ");

            num2 = teclado.nextDouble();
        }

        if (num2 != 0) {
            System.out.println("El resultado es: " + num1 / num2);
        }

        teclado.close();
    }
}
