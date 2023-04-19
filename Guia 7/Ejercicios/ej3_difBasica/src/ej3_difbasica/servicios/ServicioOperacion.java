
package ej3_difbasica.servicios;

import ej3_difbasica.entidades.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
   
    Scanner leer = new Scanner (System.in);
    
    public Operacion crearOperacion(){
        
        System.out.println("Ingrese numero1: ");
        int numero1 = leer.nextInt();
        
        System.out.println("Ingrese numero2: ");
        int numero2 = leer.nextInt();
        
        return new Operacion(numero1, numero2);
    }
    
    public int sumar(Operacion objeto){
        int num1 = objeto.getNumero1();
        int num2 = objeto.getNumero2();
        
        System.out.println("La suma es: " + (num1 + num2));
        
        return (num1 + num2);
    }
    
    public int restar(Operacion objeto){
        int num1 = objeto.getNumero1();
        int num2 = objeto.getNumero2();
        
        System.out.println("La resta es: " + (num1 - num2));
        
        return (num1 - num2);
    }
      
    public int multiplicar(Operacion objeto){
        int num1 = objeto.getNumero1();
        int num2 = objeto.getNumero2();
        
        if (num1 == 0 || num2 == 0){
            System.out.println("La multiplicacion es 0");
            return 0;
        }
            
        System.out.println("La multiplicacion es: " + (num1*num2));
        
        return (num1*num2); 
    }
    
        public int dividir(Operacion objeto){
        int num1 = objeto.getNumero1();
        int num2 = objeto.getNumero2();
        
        if (num2 == 0){
            System.out.println("La division es 0");
            return 0;
        }
            
        System.out.println("La division es: " + (num1/num2));
        
        return (num1/num2); 
    }
      
}
