
package ej2_difbasica;

import ej2_difbasica.entidades.Circunferencia;
import ej2_difbasica.servicios.ServicioCircunferencia;

public class Ej2_difBasica {

    public static void main(String[] args) {
        
        ServicioCircunferencia svCircunferencia = new ServicioCircunferencia();
        
        Circunferencia c1 = svCircunferencia.crearCircunferencia();
        
        System.out.println("El area de la circunferencia es: " + c1.area()); 
        
        System.out.println("El perimetro de la circunferencia es: " + c1.perimetro()); 
    }
    
}
