/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08.vehiculos;

import static actividad08.otrasFunciones.Pregunta.pideDouble;
import static actividad08.otrasFunciones.Pregunta.pideEntero;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franh
 */
public class Carga extends Vehiculo {
    
    private double PMA;

    public Carga(double PMA, String matricula, String modelo, int numPlazas, int diasAlquiler, int precioDia) {
        super(matricula, modelo, numPlazas, diasAlquiler, precioDia);
        this.PMA = PMA;
    }

    @Override
    public double getPrecioDia() {
        return (super.getPrecioDia()+(20*getPMA())); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public double getPMA() {
        return PMA;
    }

    public void setPMA() throws IOException {
        PMA = pideDouble("Introduce el PMA:",0);        
    }   

    @Override
    public void pideDatos() {
        super.pideDatos();
        try {
            setPMA();
        } catch (IOException ex) {
            Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void showInformacion() {
        super.showInformacion();
        System.out.println("PMA " + getPMA());
    }

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        super.getPrecioTotalAlquilerPorDias();
        
    }    
    
    
}
