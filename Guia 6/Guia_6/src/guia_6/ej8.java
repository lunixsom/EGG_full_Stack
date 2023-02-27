/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_6;

import java.util.Scanner;

public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese unsa nota por favor");
        
        int nota = leer.nextInt();
        
       
        while(!(nota>=0 && nota<=10)){
        
            System.out.println("La nota va entre 0 y 10. Ingrese una nota por favor");
        
            nota = leer.nextInt();
            
        }
        
    }
    
}
