
package ej1_difbasica.servicios;

import ej1_difbasica.entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {

    Scanner leer = new Scanner(System.in);
    
    public Libro cargarLibro(){

        System.out.println("Introducir titulo del libro");
        String titulo = leer.next();
        
        System.out.println("Introducir isbn del libro");
        int isbn = leer.nextInt();
        
        System.out.println("Introducir autor del libro");
        String autor = leer.next();
    
        System.out.println("Introducir cantidad de paginas del libro");
        int cantPaginas = leer.nextInt();
        
        return new Libro(isbn, titulo, autor, cantPaginas);
    }
    
    
    
}
