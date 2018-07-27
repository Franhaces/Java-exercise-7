/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08.vehiculos;

import static actividad08.otrasFunciones.Pregunta.pideEntero;
import java.io.IOException;

/**
 *
 * @author franh
 */
public class Camion extends Carga {
    
    private String estructura;

    public Camion(String estructura, double PMA, String matricula, String modelo, int numPlazas, int diasAlquiler, int precioDia) {
        super(PMA, matricula, modelo, numPlazas, diasAlquiler, precioDia);
        this.estructura = estructura;
    }
    
    

    public String getEstructura() {
        return estructura;
    }
    

    public void setEstructura() throws IOException {
        //Creación menú.
        //<editor-fold defaultstate="collapsed" desc="estructura">
        int opcion;
        do {
            System.out.println("Estructura:");
            System.out.println("1- Rígido");
            System.out.println("2- Remolque");
            System.out.println("3- Semiremolque");
            opcion = pideEntero("Elige una opción", 0);
            switch(opcion) {
                case 1: {
                    System.out.println("Has elegido: rígido");
                    estructura = "Rígido";
                    break;
                }
                case 2: {
                    System.out.println("Has elegido: remolque");
                    estructura = "Remolque";
                    break;
                }
                case 3: {
                    System.out.println("Has elegido: semiremolque");
                    estructura = "Semiremolque";
                    break;
                }                
                default: {
                    System.out.println("\n¡Opcion incorrecta!\n");
                }
            }
            
        } while (false);
//</editor-fold>
    }

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        System.out.println("El precio total será: "+ super.getPrecioDia()*super.getNumeroDias()+ 40 + "€");
    }

    @Override
    public void showInformacion() {
        super.showInformacion();
        System.out.println("Estructura " + getEstructura());
    }  
    
}
