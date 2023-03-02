/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadMedia;

import java.util.Scanner;
/**
 *
 * @author UdeSA
 */
public class ej7 {
    public static void main(String[] args){
        String frase;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        frase = leer.nextLine();
        
        esIgualA(frase);
    }
    
    public static void esIgualA( String frase){
        if (frase.equals("eureka")){
            System.out.println("La frase es CORRECTA");
        } else {
            System.out.println("La frase es INCORRECTA");
          }
    }
}
