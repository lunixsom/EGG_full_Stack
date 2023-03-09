/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args){
        int cant;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de elementos: ");
        cant = leer.nextInt();
        
    // Genero solo la primer linea de * :    
        for (int i = 0; i < 1; i++) {                
            for (int j = 0; j < cant; j++) {
                System.out.print("*");                
            } 
            System.out.println("");
        }
        
    // Genero las filas con los espacios vacios:    
        for (int i = 0; i < cant - 2; i++) {
            System.out.print("*");
            for (int j = 0; j<cant-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
    // Genero la ultima linea de * :    
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < cant; j++) {
                System.out.print("*");                
            } 
        }      
    }
}       
        


