
package ej4_difbasica.servicios;

import ej4_difbasica.entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
   
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        System.out.print("Ingrese Base del rectangulo: ");
        int base = leer.nextInt();
        
        System.out.print("Ingrese Altura del rectangulo: ");
        int altura = leer.nextInt();
        
        return new Rectangulo(base, altura);
    }
    
    public int superficie(Rectangulo objeto){
        return objeto.getBase()*objeto.getAltura();
    }
    
    public int perimetro(Rectangulo objeto){
        return ((objeto.getBase() + objeto.getAltura())* 2);
    }
}
