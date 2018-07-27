package actividad02;

import java.util.Scanner;

/**
 *
 * @author franh
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //necesario para leer del teclado
        int op;

        double botella1 = 0;
        double botella2 = 0;
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        do {
            System.out.println("Introduce una opción");
            System.out.println("1-Añadir refresco al primer recipiente");
            System.out.println("2-Traspasar refresco del primer al segundo recipiente");
            System.out.println("3-Quitar refresco del segundo recipiente");
            System.out.println("0-Finalizar");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("¿Cuántos litros de refresco quieres añadir a la botella 1? ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0) {
                        if (botella1 >= 0) {
                            botella1 += num1;
                            System.out.println("Has añadido: " + num1 + " litros a la botella 1");
                            System.out.println("La botella 1 tiene: " + botella1 + "L.");
                            System.out.println("La botella 2 tiene: " + botella2 + "L.");
                        } else {
                            System.out.println("La botella 1 no puede contener números negativos");
                        }
                    } else {
                        System.out.println("Introduce un número positivo");
                    }
                    break;
                case 2:
                    System.out.println("¿Cuántos litros traspasamos de la botella 1 a la 2? ");
                    num2 = sc.nextDouble();
                    if (num2 >= 0) {
                        if (botella1 - num2 >= 0) {
                            System.out.println("Has traspasado: " + num2 + " litros de la botella 1 a la botella 2");
                            botella2 += num2;
                            botella1 -= num2;
                            System.out.println("La botella 1 tiene: " + botella1 + "L.");
                            System.out.println("La botella 2 tiene: " + botella2 + "L.");
                        } else {
                            System.out.println("La botella 1 no tiene tantos litros");
                        }
                    } else {
                        System.out.println("Introduce un número positivo");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuántos litros de refresco quieres quitar a la botella 2?");
                    num3 = sc.nextDouble();
                    if (num3 >= 0) {
                        if (botella2 - num3 >= 0) {
                            System.out.println("Has quitado: " + num3 + " litros a la botella 2");
                            botella2 -= num3;
                            System.out.println("La botella 1 tiene: " + botella1 + "L.");
                            System.out.println("La botella 2 tiene: " + botella2 + "L.");
                        } else {
                            System.out.println("La botella 2 no tiene tantos litros");
                        }
                    } else {
                        System.out.println("Introduce un número positivo");
                    }
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("No es una opción correcta!");
            }
        } while (op != 0);
    }
}
