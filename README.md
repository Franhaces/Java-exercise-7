# Utilización avanzada de clases
Ejercicio Java 

## Objetivos


-	Crear y utilizar clases heredadas, interfaces y clases abstractas.
-	Crear y utilizar atributos estáticos.
-	Crear clases heredadas que sobrecarguen la implementación de métodos de la superclase.
-	Realizar programas que implementen y utilicen jerarquías de clases.



#### Actividad 1
## *Alquiler de vehículos*


##### **Crea las siguientes clases teniendo presente que los atributos han de ser todos privados.**


1. Crea en el package actividad08.vehiculos una interfaz IVehiculo que defina los <br/>  métodos:
    * a. setNumeroDias()  que reciba un parámetro del tipo entero
    * b. getPrecioTotalAlquilerPorDias ()
    * c. showInformacion()
    * d. pideDatos()



2. Crea en el package actividad08.vehiculos una clase abstracta Vehiculo que herede <br/>  de IVehiculo  y que almacene la información de un vehículo útil para una empresa <br/>  de alquiler de vehículos, en concreto como mínimo ha de almacenar:
    * a. La matrícula
    * b. El modelo
    * c. El número de plazas
    * d. El número de días que está alquilado
    * e. El precio base de alquiler por cada día establecido en 50€  y que no se pueda <br/>  modificar. (final)
    * f. setNumDias();
    * g. Una función getPrecioTotalAlquilerPorDias() que muestre por consola el <br/>  coste total multiplicando el número de días por el precio base.
    * h. Una función showInformacion() que muestre todos los datos del Vehículo, <br/>  incluido su precio total de alquiler por días.
    * i. Una función pideDatos() que pida y establezca todos los  datos de Vehiculo;



3. Crea en el package actividad08.vehiculos una clase Coche que herede de IVehiculo <br/>  y que herede de Vehiculo y contenga:
    * a. La gama del Coche ( A, B , C , D)
    * b. Una función getPrecioTotalAlquilerPorDias() que sobrescriba la función <br/>  heredada de Vehiculo y retorne el precio del alquiler teniendo presente que <br/>  al precio base se le suma la cantidad de 1.5 € por plaza y día.
    * c. Una función showInformacion() que sobrescriba la función heredada de <br/>  Vehiculo y muestre todos los datos del Coche, incluido su precio total de <br/>  alquiler por días y la gama.
    * d. Una función pideDatos() que sobrescriba la función heredada de Vehiculo <br/>  y que pida y  establezca todos los  datos de Coche;
    


4. Crea en el package actividad08.vehiculos una clase Carga que herede de IVehiculo <br/>  y que herede de Vehiculo y contenga:
    * a. El PMA (el peso máximo autorizado en toneladas)
    * b. Una función getPrecioTotalAlquilerPorDias() que sobrescriba la función <br/>  heredada de Vehiculo y retorne el precio del alquiler teniendo presente que <br/>  al precio base se le suma 20 € * PMA (PMA = peso máximo <br/>  autorizado en toneladas).
    * c. Una función showInformacion() que sobrescriba la función heredada de <br/>  Vehiculo y muestre todos los datos de Carga, incluido su precio total <br/>  de alquiler por días y PMA.
    * d. Una función pideDatos() que sobrescriba la función heredada de Vehiculo y <br/>  que pida y establezca todos los  datos de Carga;



5. Crea en el package actividad08.vehiculos una clase Camion  que herede de <br/>  IVehiculo  y que herede de Carga y que contenga:
    * a. Tipo de estructura ,  que puede ser: rígido, remolque, semirremolque.
    * b. Una función getPrecioTotalAlquilerPorDias() que sobrescriba la función <br/>  heredada de Carga y retorne el precio del alquiler teniendo presente que el <br/>  precio es el mismo que para Carga pero sumándole un fijo de 40€, <br/>  independientemente de los días de alquiler.
    * c. Una función showInformacion() que sobrescriba la función heredada de <br/>  Carga y muestre todos los datos del Camion, incluido su precio total de <br/>  alquiler por días y la estructura.


6. Crea en el package actividad08 la clase main GestionVehiculos con un array de 4 <br/>  posiciones del tipo IVehiculo que almacene  como mínimo un  Coche, Carga y <br/>  Camion. Crea un menú que permita:
    1.	Crear una variable del tipo Coche y añadirla en una posición del array.
    2.	Crear una variable del tipo Carga y añadirla en una posición del array.
    3.	Crear una variable del tipo Camion y añadirla en una posición del array.
    4.	Mostrar la información de cualquier vehiculo de la flota.
    5.	Modificar los días de alquiler de un vehiculo de la flota y mostrar su precio
    6.	Mostrar de golpe toda la información de todos los vehículos de la flota.
    7.	Fin
