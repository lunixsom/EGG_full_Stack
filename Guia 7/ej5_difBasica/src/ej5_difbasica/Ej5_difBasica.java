
package ej5_difbasica;

import ej5_difbasica.entidades.Cuenta;
import ej5_difbasica.servicios.ServicioCuenta;

public class Ej5_difBasica {

    public static void main(String[] args) {
      
        ServicioCuenta sv = new ServicioCuenta();
        
        Cuenta c1 = sv.crearCuenta();
        
        sv.ingresar(c1);
        
        System.out.println(c1);
                
    }
    
}
