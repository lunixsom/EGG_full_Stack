/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_6;

import java.util.Scanner;

/**
 *
 * @author UdeSA
 */
public class pruebas {
    public static void main(String[] args) {
    String frase = "hola";
    char letra = 'x';
    
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese nueva frase");
    //newFrase = leer.nextLine();
    //newFrase = newFrase.concat(frase);
    //    System.out.println("la nueva frase es.¡: " + newFrase);
    
    int longi = frase.length();
    
        for (int i = 0; i < longi; i++) {
            System.out.println("la letra en la posicion " + i + " " + "es: " + frase.charAt(i));
        }
        
        frase = frase + letra;
        
        System.out.println("AHORA la nueva frase es: " + frase);
    }
   
   
}
