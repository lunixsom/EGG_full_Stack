
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
    
    private Scanner leer =  new Scanner(System.in).useDelimiter("\n");
    // .useDelimiter(\n) : para que me acepte escribir con espacios
    
    public Mascota crearMascota(){
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
              
        //Mascota m = new Mascota(nombre, apodo, tipo);
        
        //return m;
        
        return new Mascota(nombre, apodo, tipo);
    }
}
