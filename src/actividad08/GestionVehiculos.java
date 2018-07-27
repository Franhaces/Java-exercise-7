/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

import static actividad08.otrasFunciones.Pregunta.pideEntero;
import actividad08.vehiculos.Camion;
import actividad08.vehiculos.Carga;
import actividad08.vehiculos.Coche;
import actividad08.vehiculos.IVehiculo;
import java.io.IOException;

/**
 *
 * @author franh
 */
public class GestionVehiculos {

    private static IVehiculo[] flota = new IVehiculo[4];

    public static void main(String[] args) throws IOException {

        Coche coche1 = new Coche("A", "2525-TFT", "Opel", 5, 2, 51.5);
        Carga carga1 = new Carga(2, "2343-GFD", "Delta", 0, 3, 90);
        Camion camion1 = new Camion("Rígido", 15, "6514-MFR", "Scania", 3, 5, 350);

        flota[0] = coche1;
        flota[1] = carga1;
        flota[2] = camion1;

        int opcion;
        do {
            System.out.println("\n     MENU    ");
            System.out.println("==============");
            System.out.println("1- Crear una variable del tipo Coche y añadirla en una posición del array.");
            System.out.println("2- Crear una variable del tipo Carga y añadirla en una posición del array.");
            System.out.println("3- Crear una variable del tipo Camión y añadirla en una posición del array.");
            System.out.println("4- Mostrar la información de cualquier vehiculo de la flota.");
            System.out.println("5- Modificar los días de alquiler de un vehiculo de la flota y mostrar su precio.");
            System.out.println("6- Mostrar de golpe toda la información de todos los vehículos de la flota.");
            System.out.println("7- Salir \n");
            opcion = pideEntero("Elige una opción", 0);

            switch (opcion) {
                case 1: {
                    System.out.println("\n1- Crear una variable del tipo Coche y añadirla en una posición del array");
                    System.out.println("---------------------------------------------------------------------------\n");
                    int pos;
                    Coche coche2 = new Coche("", "", "", 0, 0, 0);
                    coche2.pideDatos();
                    do {
                        System.out.println("\n¿En qué posición del array quieres añadir el coche?");
                        pos = pideEntero("", 0);
                        if (pos < 1 || pos > 4) {
                            System.out.println("La posición tiene que estar entre y 1 y 4 incl.");
                        } else {
                            if (flota[pos-1]!=null) {
                                int op;
                                do {                                    
                                    System.out.println("En esta posición ya hay un vehículo");
                                    System.out.println("¿Deseas sobreescribir el vehiculo nuevo?");
                                    System.out.println("1- Si");
                                    System.out.println("2- No");
                                    op = pideEntero("Elige una opción.", 0);
                                    switch (op) {
                                        case 1: {
                                            flota[pos - 1] = coche2;
                                            break;
                                        }
                                        
                                        case 2: {
                                            pos = -1;
                                            break;
                                        }
                                    }
                                } while (false);                                
                            }else {
                                flota[pos - 1] = coche2;
                            }                            
                        }
                    } while (pos < 1 || pos > 4);

                    break;
                }
                case 2: {
                    System.out.println("\n2- Crear una variable del tipo Carga y añadirla en una posición del array");
                    System.out.println("---------------------------------------------------------------------------\n");
                    int pos;
                    Carga carga2 = new Carga(0, "", "", 0, 0, 0);
                    carga2.pideDatos();
                    do {
                        System.out.println("\n¿En qué posición del array quieres añadir la carga?");
                        pos = pideEntero("", 0);
                        if (pos < 1 || pos > 4) {
                            System.out.println("La posición tiene que estar entre y 1 y 4 incl.");
                        } else {
                            flota[pos - 1] = carga2;
                        }
                    } while (pos < 1 || pos > 4);

                    break;
                }
                case 3: {
                    System.out.println("\n3- Crear una variable del tipo Camión y añadirla en una posición del array");
                    System.out.println("----------------------------------------------------------------------------\n");
                    int pos;
                    Camion camion2 = new Camion("", 0, "", "", 0, 0, 0);
                    camion2.pideDatos();
                    camion2.setEstructura();
                    do {
                        System.out.println("\n¿En qué posición del array quieres añadir el camion?");
                        pos = pideEntero("", 0);
                        if (pos < 1 || pos > 4) {
                            System.out.println("La posición tiene que estar entre y 1 y 4 incl.");
                        } else {
                            flota[pos - 1] = camion2;
                        }
                    } while (pos < 1 || pos > 4);

                    break;
                }
                case 4: {
                    System.out.println("\n4- Mostrar la información de cualquier vehiculo de la flota");
                    System.out.println("-------------------------------------------------------------\n");

                    int op;
                    do {
                        System.out.println("¿Qué vehículo quieres consultar?");
                        System.out.println("================================");
                        System.out.println("1- Vehículo 1");
                        System.out.println("2- Vehículo 2");
                        System.out.println("3- Vehículo 3");
                        System.out.println("4- Vehículo 4");
                        System.out.println("5- Salir \n");
                        opcion = pideEntero("Elige una opción", 0);

                        switch (opcion) {
                            case 1: {
                                System.out.println("\nVehículo 1");
                                System.out.println("------------\n");
                                flota[0].showInformacion();
                                System.out.println("");
                                break;
                            }
                            case 2: {
                                System.out.println("\nVehículo 2");
                                System.out.println("------------\n");
                                flota[1].showInformacion();
                                System.out.println("");
                                break;
                            }
                            case 3: {
                                System.out.println("\nVehículo 3");
                                System.out.println("------------\n");
                                flota[2].showInformacion();
                                System.out.println("");
                                break;
                            }
                            case 4: {
                                System.out.println("\nVehículo 4");
                                System.out.println("------------\n");
                                if (flota[3] == null) {
                                    System.out.println("Posición vacía");
                                } else {
                                    flota[3].showInformacion();
                                }
                                System.out.println("");
                                break;
                            }
                            case 5: {
                                System.out.println("\nFIN DE PROGRAMA.");
                                System.out.println("----------------\n");
                                break;
                            }
                            default: {
                                System.out.println("\n¡Opcion incorrecta!\n");
                            }
                        }
                    } while (opcion != 5);
                    break;
                }
                case 5: {
                    System.out.println("\n5- Modificar los días de alquiler de un vehiculo de la flota y mostrar su precio");
                    System.out.println("----------------------------------------------------------------------------------");
                    int op;
                    do {
                        System.out.println("\nElige un vehículo:");
                        System.out.println("===================");
                        System.out.println("1- Vehículo 1");
                        System.out.println("2- Vehículo 2");
                        System.out.println("3- Vehículo 3");
                        System.out.println("4- Vehículo 4");
                        System.out.println("5- Salir \n");
                        opcion = pideEntero("Elige una opción", 0);

                        switch (opcion) {
                            case 1: {
                                System.out.println("\nVehículo 1");
                                System.out.println("------------\n");
                                flota[0].setNumeroDias(0);
                                System.out.println("");
                                flota[0].getPrecioTotalAlquilerPorDias();
                                System.out.println("");
                                break;
                            }
                            case 2: {
                                System.out.println("\nVehículo 2");
                                System.out.println("------------\n");
                                flota[1].setNumeroDias(0);
                                System.out.println("");
                                flota[1].getPrecioTotalAlquilerPorDias();
                                System.out.println("");
                                break;
                            }
                            case 3: {
                                System.out.println("\nVehículo 3");
                                System.out.println("------------\n");
                                flota[2].setNumeroDias(0);
                                System.out.println("");
                                flota[2].getPrecioTotalAlquilerPorDias();
                                System.out.println("");
                                break;
                            }
                            case 4: {
                                System.out.println("\nVehículo 4");
                                System.out.println("------------\n");
                                if (flota[3] == null) {
                                    System.out.println("Posición vacía");
                                } else {
                                    flota[3].setNumeroDias(0);
                                    System.out.println("");
                                    flota[0].getPrecioTotalAlquilerPorDias();
                                    System.out.println("");
                                }
                                System.out.println("");
                                break;
                            }
                            case 5: {
                                System.out.println("\nFIN DE PROGRAMA.");
                                System.out.println("----------------\n");
                                break;
                            }
                            default: {
                                System.out.println("\n¡Opcion incorrecta!\n");
                            }
                        }
                    } while (opcion != 5);
                    break;
                }
                case 6: {
                    System.out.println("\n6- Mostrar de golpe toda la información de todos los vehículos de la flota");
                    System.out.println("----------------------------------------------------------------------------\n");
                    for (int i = 0; i < flota.length; i++) {
                        System.out.println("**************");
                        System.out.println("* POSICIÓN " + (i + 1) + " *");
                        System.out.println("**************");
                        if (flota[i] == null) {
                            System.out.println("Posición vacía");
                        } else {
                            flota[i].showInformacion();
                            System.out.println("");
                        }                        
                    }

                    break;
                }
                case 7: {
                    System.out.println("\nFIN DE PROGRAMA.");
                    System.out.println("----------------\n");
                    break;
                }
                default: {
                    System.out.println("\n¡Opcion incorrecta!\n");
                }
            }

        } while (opcion != 7);
    }
}
