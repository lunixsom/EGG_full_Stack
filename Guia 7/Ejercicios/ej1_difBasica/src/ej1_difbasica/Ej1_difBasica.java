
package ej1_difbasica;

import ej1_difbasica.entidades.Libro;
import ej1_difbasica.servicios.ServicioLibro;

public class Ej1_difBasica {

    public static void main(String[] args) {
        
        ServicioLibro sv = new ServicioLibro();
        
        Libro lb = sv.cargarLibro();
        
        System.out.println("libro cargado: " + lb.toString());
    }
}
