
package ej6_difbasica;

import ej6_difbasica.entidades.Cafetera;
import ej6_difbasica.servicios.ServicioCafetera;

public class Ej6_difBasica {

    public static void main(String[] args) {
        
        ServicioCafetera sv = new ServicioCafetera();
        
        Cafetera c1 = sv.crearCafetera();
        
        c1.agregarCafe(10);
        
        c1.servirTaza(50);
        
    }
    
}
