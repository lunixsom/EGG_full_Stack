
package ej4_difbasica;

import ej4_difbasica.entidades.Rectangulo;
import ej4_difbasica.servicios.ServicioRectangulo;

public class Ej4_difBasica {

    public static void main(String[] args) {
       
        ServicioRectangulo sv = new ServicioRectangulo();
        
        Rectangulo rt = sv.crearRectangulo();
        
        System.out.println("La superficie del rectangulo es: " + sv.superficie(rt));
        
        System.out.println("El perimetro del rectangulo es: " + sv.perimetro(rt));
        
    }
    
}
