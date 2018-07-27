package actividad03;

import java.util.Scanner;

/**
 *
 * @author franh
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //necesario para leer del teclado

        System.out.print("Dime un número entero mayor que 7: ");
        int n1;
        n1 = teclado.nextInt();

        while (n1 <= 7) {
            System.out.print("Dime un número entero mayor que 7: ");
            n1 = teclado.nextInt();
        }

        for (int i = 0; i <= n1; i++) {
            System.out.println(i);
        }
    }

}
