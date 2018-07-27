/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08.vehiculos;

import static actividad08.otrasFunciones.Pregunta.pideEntero;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franh
 */
public class Coche extends Vehiculo {
    private String gama;
    
    public Coche(String gama, String matricula, String modelo, int numPlazas, int diasAlquiler, double precioDia) {
        super(matricula, modelo, numPlazas, diasAlquiler, precioDia);
        this.gama = gama;        
    }
    

    public String getGama() {
        return gama;
    }
    

    @Override
    public double getPrecioDia() {
        return super.getPrecioDia() + 1.5; 
    }
    
    
    
    public void setGama() throws IOException {
        
        //Creación menú.
        //<editor-fold defaultstate="collapsed" desc="setGama">
        int opcion;
        do {
            System.out.println("Gama del coche:");
            System.out.println("1- Gama A");
            System.out.println("2- Gama B");
            System.out.println("3- Gama C");
            System.out.println("4- Gama D");
            opcion = pideEntero("Elige una opción", 0);
            switch(opcion) {
                case 1: {
                    System.out.println("Has elegido la gama: A");
                    gama = "A";
                    break;
                }
                case 2: {
                    System.out.println("Has elegido la gama: B");
                    gama = "B";
                    break;
                }
                case 3: {
                    System.out.println("Has elegido la gama: C");
                    gama = "C";
                    break;
                }
                case 4: {
                    System.out.println("Has elegido la gama: D");
                    gama = "D";
                    break;
                }
                default: {
                    System.out.println("\n¡Opcion incorrecta!\n");
                }
            }
            
        } while (opcion>4 || opcion<1);
//</editor-fold>
    }
    

    @Override
    public void pideDatos() {
        super.pideDatos();
        try {
            setGama();
        } catch (IOException ex) {
            Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    

    @Override
    public void showInformacion() {
        super.showInformacion();
        System.out.println("Gama: " + getGama());
    }
    

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        System.out.println("El precio total será: "+ getPrecioDia() * getNumeroDias() + "€");
    }
    
    
    
}
