
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {
       
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1);
        
//    public String nombre;
//    public String apodo;
//    // Conejo, Perro, Gato, Loro, Carpincho
//    public String tipo;
//    public String color;
//    public String raza;
//    public int edad;
//    public boolean cola;
    }
    
}
