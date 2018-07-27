/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08.otrasFunciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author franh
 */
public class Pregunta {
    
    // Función pideEntero
    public static int pideEntero(String question, int numero) throws IOException {
        int entero = 0;
        String lectura;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(question);
            try {
                lectura = br.readLine();
                entero = Integer.parseInt(lectura);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. No es un número entero");
                continue;
            }
        }

        return entero;
    }

    // Función pideDouble
    public static double pideDouble(String question, double numero) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double valor = null;
        String texto;
        while (true) {
            System.out.println(question);
            try {
                texto = br.readLine();
                valor = Double.parseDouble(texto);
                break;
            } catch (java.lang.NumberFormatException ex) {
                System.out.println("Valor introducido incorrecto. Vuelve a intentarlo:");
            }
        }
        return valor;
    }
    
}
