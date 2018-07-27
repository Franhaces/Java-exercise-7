/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08.vehiculos;

import static actividad08.otrasFunciones.Pregunta.pideEntero;
import static actividad08.otrasFunciones.Regex.regex;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franh
 */
public abstract class Vehiculo implements IVehiculo{
    private String matricula;
    private String modelo;
    private int numPlazas;
    private int numeroDias;
    private final double precioDia;

    public Vehiculo(String matricula, String modelo, int numPlazas, int diasAlquiler, double precioDia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numPlazas = numPlazas;
        this.numeroDias = diasAlquiler;
        this.precioDia = 50;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula() {
        matricula = regex("Matrícula: ");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo() {
        modelo = regex("Modelo: ");
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas() throws IOException {
        numPlazas = pideEntero("Número de plazas: ",0);
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public double getPrecioDia() {
        return precioDia;
    }
    
    //Heredados de IVehiculo

    @Override
    public void setNumeroDias(int dias) {
        try {
            this.numeroDias = pideEntero("Días de alquiler:",0);
        } catch (IOException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        System.out.println("El precio total será: "+ getPrecioDia()*getNumeroDias() + "€");
    }

    @Override
    public void showInformacion() {
        System.out.println("Mtrícula: " + getMatricula());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Nº de plazas: " + getNumPlazas());
        System.out.println("Nº de dias alquilado: " + getNumeroDias());
        System.out.println("Precio día/alquiler: " + getPrecioDia()+"€");
        getPrecioTotalAlquilerPorDias();
    }

    @Override 
    public void pideDatos() {
        setMatricula();
        setModelo();
        try {
            setNumPlazas();
        } catch (IOException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        setNumeroDias(0);
    }
    
}
