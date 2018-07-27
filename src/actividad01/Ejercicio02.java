// Actividad 1:ELEMENTOS DE UN PROGRAMA
package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author franh
 */
public class Ejercicio02 {

    public static void main(String[] args) throws IOException {

        // 1.3
        System.out.println("--1.3--");
        System.out.println("--TIPOS DE DATOS SIMPLES--");
        //Se utilizan 8 bits (1 byte) para almacenar el dato.
        byte varByte = 1;
        System.out.println("Variable tipo byte muestra datos enteros de 8 bits. Ejemplo: " + varByte);

        //Dato de 16 bits de longitud 
        short varShort = 2;
        System.out.println("Variable tipo short muestra datos enteros de 16 bits. Ejemplo: " + varShort);

        //Dato de 32 bits de longitud
        int varInt = 100;
        System.out.println("Variable tipo int muestra datos enteros de 32 bits. Ejemplo: " + varInt);

        //Tipo de dato entero de 64 bits de longuitud
        long varLong = 1000000;
        System.out.println("Variable tipo long muestra datos enteros de 64 bits. Ejemplo: " + varLong);

        //Tipo de caracter unicode de 16 bits de longuitud.
        char letraChar = 'a';
        System.out.println("Variable tipo char muestra caracteres unicode de 16 bits. Ejemplo: " + letraChar);

        //Tipo de dato de coma flotante de precisión simple de 32 bits de longuitud.
        float varFloat = 123.2f;
        System.out.println("Variable tipo float muestra datos de coma flotante de precisión simple de 32 bits. Ejemplo: " + varFloat);

        //Tipo de dato de coma flotante de precisión doble de 64 bits de longuitud.
        double varDouble = 259.7;
        System.out.println("Variable tipo double muestra datos de coma flotante de precisión doble de 64 bits. Ejemplo: " + varDouble);

        //Evalúa si el resultado de una expresión es verdadero o falso. 1 bit de información.
        boolean varBoolean = true;
        System.out.println("Variable tipo boolean muestra si una expresión es verdadera o falsa. Ejemplo: " + varBoolean);

        // 1.4
        //OPERADORES ARITMÉTICOS:
        System.out.println("--1.4--");
        System.out.print("\n");
        System.out.println("--OPERADORES ARITMÉTICOS--");
        int a = 10;
        int b = 20;
        int e = 0;

        //Adición (+)
        System.out.println("(+) Suma los valores de los operadores: a + b = " + (a + b));

        //Resta (-)
        System.out.println("(-) Resta los valores de los operadores: a - b = " + (a - b));

        //Multiplicación (*)
        System.out.println("(*) Multiplica los valores de los operadores: a * b = " + (a * b));

        //División (/)
        System.out.println("(/) Divide los valores de los operadores: b / a = " + (b / a));

        //Módulo (&)
        System.out.println("(&) Divide el valor de la izquierda por el de la derecha y devuelve el resto: b % a = " + (b % a));

        //OPERADORES RELACIONALES
        System.out.print("\n");
        System.out.println("--OPERADORES RELACIONALES--");
        //<
        System.out.println("(<) Comprueba si el valor de la izquierda es menor que el de la derecha: a < b = " + (a < b));

        //>
        System.out.println("(>) Comprueba si el valor de la izquierda es mayor que el de la derecha: a > b = " + (a > b));

        //<=
        System.out.println("(<=) Comprueba si el valor de la izquierda es menor o igual que el de la derecha: a <= b = " + (a <= b));

        //>=
        System.out.println("(>=) Comprueba si el valor de la izquierda es mayor o igual que el de la derecha: a >= b = " + (a >= b));

        //!=
        System.out.println("(!=) Comprueba si dos valores son iguales,si no lo son, la condición se convierte en realidad: a != b = " + (a != b));

        //==
        System.out.println("(==) Comprueba si los valores de dos operandos son iguales o no: a == b = " + (a == b));

        //OPERADORES LÓGICOS
        System.out.print("\n");
        System.out.println("--OPERADORES LÓGICOS--");
        boolean c = true;
        boolean d = false;

        //&&
        System.out.println("(&&) AND. Si ambos operandos son distintos a cero, entonces la condición sea verdadera: c && d = " + (c && d));

        //||
        System.out.println("(||) OR. Si alguno de los dos operados son no cero, entonces la condición sea verdadera: c || d = " + (c || d));

        //!	
        System.out.println("(!) NOT. Utilizado para invertir el estado lógico de su operando: !(c && d) = " + !(c && d));

        //OPERADORES UNITARIOS
        System.out.print("\n");
        System.out.println("--OPERADORES UNITARIOS--");
        //~
        System.out.println("(~) Coplemento a 1 del operando: ~a =" + ~a);

        //-
        System.out.println("(-) Cambio de signo del operando: -a =" + -a);

        //Incremento (++)
        System.out.println("(++) Aumenta el valor del operando en 1: a++ = " + (a++));

        //Decremento (--)
        System.out.println("(--) Disminuye el valor del operando en 1: b-- = " + (a--));

        //! (Ya visto(
        //OPERADORES DE ASIGNACIÓN
        System.out.print("\n");
        System.out.println("--OPERADORES DE ASIGNACIÓN--");
        // =
        e = a + b;
        System.out.println("(=) Asigna valores de operados del lado derecho al operando del lado izquierdo: e = a + b = " + e);

        // +=
        e += a;
        System.out.println("(+=) Añade operando derecho al operando izquierdo y asigna el resultado al operando de la izquierda: e += a  = " + e);

        // -=
        e -= a;
        System.out.println("(-=) Resta el operando derecho del operando de la izquierda y asigna el resultado al operando de la izquierda: e -= a = " + e);

        // *=
        e *= a;
        System.out.println("(*=) Multiplica los operandos y asigna el resultado a la izquierda del operando: e *= a = " + e);

        // /=
        a = 10;
        e = 15;
        e /= a;
        System.out.println("(/=) Divide el operando izquierdo con el operando derecho y asigna el resultado a la izquierda del operando: e /= a = " + e);

        // %=
        a = 10;
        e = 15;
        e %= a;
        System.out.println("(&=) Se saca el módulo el operando izquierdo con el operando derecho y asignan el resultado al operando de la izquierda: e %= a  = " + e);

        //1.5
        System.out.print("\n");
        System.out.println("--1.5--");
        int número;

        número = 0;

        //Mostramos un mensaje al usuario pidiendole que indique un numero por consola
        System.out.println("Dime un número y lo multiplico por 100");
        //Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        //Las variables del tipo "BufferedReader" contienen funciones para leer datos por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //utilizamos la función "readLine" de la variable "br" para leer un dato por consola
        //guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();

        /*Convertimos la variable "valor_escrito" a un valor entero para poder operar con él   
		 * y lo almacenamos en la variable "numero_melones_comer"
         */
        int número_multiplico = Integer.parseInt(valor_escrito);

        número = número_multiplico * 100;
        System.out.println("Tu número es:" + número + "");

        //Conversiones
        System.out.print("\n");
        System.out.println("Conversión implícita:");
        System.out.println("int número;");
        System.out.println("número = 0;");

        System.out.print("\n");
        System.out.println("Conversión explícita:");
        System.out.println("int número_multiplico = Integer.parseInt(valor_escrito);");
    }
}
