
package ej6_difbasica.servicios;

import ej6_difbasica.entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
    
        System.out.print("Ingrese capacidad maxima en ml de la cafetera: ");
        int capacidadMaxima = leer.nextInt();
        
        System.out.print("Ingrese cantidad actual de ml de la cafetera: ");
        int cantidadActual = leer.nextInt();
        
        return new Cafetera(capacidadMaxima, cantidadActual);
    }
}
