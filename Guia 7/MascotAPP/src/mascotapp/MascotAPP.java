
package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {
       
        int a = 10;
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        Mascota mm = new Mascota();
        
        modificador(a, mm);
        
        System.out.println(m1);
        
        System.out.println("a: " +a);
        System.out.println("Mascota " +mm);
        
//    public String nombre;
//    public String apodo;
//    // Conejo, Perro, Gato, Loro, Carpincho
//    public String tipo;
//    public String color;
//    public String raza;
//    public int edad;
//    public boolean cola;
    }
    
    public static void modificador(int num, Mascota m){
        
        num = 100;
        m.setApodo("Mascota Referencia");
    }
    
}
