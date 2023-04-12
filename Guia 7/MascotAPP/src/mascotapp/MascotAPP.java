
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Fernando Chiquito", leer.next() , "Perro");
        
        m1.setNombre("Pepe Chiquito");
        
        m1.pasear(100,4);
        
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
