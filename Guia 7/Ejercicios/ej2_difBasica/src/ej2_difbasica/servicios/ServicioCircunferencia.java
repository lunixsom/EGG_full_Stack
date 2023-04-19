
package ej2_difbasica.servicios;

import ej2_difbasica.entidades.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
   
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Introducir radio de la circunferencia");
        float radio = leer.nextFloat();
        
        return new Circunferencia(radio);
    }
    
}
