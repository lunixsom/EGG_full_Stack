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
public class ej8 {
    public static void main(String[] args){
        String frase;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        frase = leer.nextLine();
        
        int longitud = dameLongitud(frase);
        
        esIgualAOcho(longitud);
    }
    
    public static int dameLongitud(String frase){
       int longitud;
       
       longitud = frase.length();
        
       return longitud;
    }
    
    public static void esIgualAOcho(int longitud){
        if (longitud == 8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
