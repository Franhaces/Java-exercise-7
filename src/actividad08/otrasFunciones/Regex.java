/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08.otrasFunciones;

import java.util.Scanner;

/**
 *
 * @author franh
 */
public class Regex {

    public static String regex(String pregunta1) {
        
        Scanner sc = new Scanner(System.in);
        String especiales = ".*[`<>,~!@#$^&*\\%|;:\\\\'\"\\[\\]{}\\)\\(/+=].*";
        String nom = null;
        try {
            System.out.println(pregunta1);
            nom = sc.next();
            while (nom.matches(especiales)) {
                System.out.println("ERROR! El nombre no puede contener caracteres especiales.");
                nom = sc.next();
            }
            
        } catch (Exception e) {
        }

        return nom;
        
        
    }
}
