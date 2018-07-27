/* Actividad 1:ELEMENTOS DE UN PROGRAMA
        1.1
 */
package actividad01;

/*
 * @author franh
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {
        // Declaramos dos variables en las que almacenar valores númericos
        // las variables de tipo "int" nos permiten almacenar enteros
        int total_manzanas;
        int total_peras;

        // guardamos valores enteros en las variables enteras
        total_manzanas = 10;
        total_peras = 20;

        // modificamos el contenido de las variables enteras porque el granizo las ha mermado
        total_manzanas = total_manzanas - 2;
        total_peras = total_peras - 10;

        // mostramos por consola el valor de las variables enteras. De forma implícita se convierte de de int a string.
        System.out.println("Quedan " + total_manzanas + " manzanas despues del granizo");
        System.out.println("Quedan " + total_peras + " peras despues del granizo");

        // Mostramos un mensaje al usuario pidiendole que indique un numero por consola
        System.out.println("Quantas mazanas te quieres comer?");
        
        // Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        // Las variables del tipo "BufferedReader" contienen funciones para leer datos por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // utilizamos la función "readLine" de la variable "br" para leer un dato por consola
        // guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();

        /* Convertimos mediante una conversion explicita la variable "valor_escrito" 
        a un valor entero para poder operar con él y lo almacenamos en la variable 
        "numero_melones_comer" */
        int numero_manzanas_comer = Integer.parseInt(valor_escrito);

        total_manzanas = total_manzanas - numero_manzanas_comer;
        System.out.println("Finalmente quedan " + total_manzanas + " manzanas");

        /* Actividad 1:ELEMENTOS DE UN PROGRAMA
         1.2
            Lo mismo que las manzanas pero con las peras
         */
        System.out.println("Quantas peras te quieres comer?");

        br = new BufferedReader(new InputStreamReader(System.in));

        valor_escrito = br.readLine();

        int numero_peras_comer = Integer.parseInt(valor_escrito);

        total_peras = total_peras - numero_peras_comer;
        System.out.println("Finalmente quedan " + total_peras + " peras5");
    }
}
