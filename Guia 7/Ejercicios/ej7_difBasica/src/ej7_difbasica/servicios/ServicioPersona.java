
package ej7_difbasica.servicios;

import ej7_difbasica.entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {
  
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
    
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        
        System.out.print("Ingrese sexo: ");
        String sexo = leer.next();
        
        System.out.print("Ingrese peso: ");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese altura: ");
        double altura = leer.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
}
