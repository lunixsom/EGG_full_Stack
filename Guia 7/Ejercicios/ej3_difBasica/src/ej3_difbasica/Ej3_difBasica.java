
package ej3_difbasica;

import ej3_difbasica.entidades.Operacion;
import ej3_difbasica.servicios.ServicioOperacion;

public class Ej3_difBasica {

    public static void main(String[] args) {
      
        ServicioOperacion sv = new ServicioOperacion();
        
        Operacion op = sv.crearOperacion();
        
        sv.sumar(op);
        
        sv.restar(op);
        
        sv.multiplicar(op);
        
        sv.dividir(op);
    }
    
}
