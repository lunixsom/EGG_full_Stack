/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificultadBaja;

import java.util.Scanner;
/**
 *
 * @author esome
 */
public class ej3 {
    public static void main(String[] args ){
        String frase;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        mostrarEnMay(frase);
        mostrarEnMin(frase);
    }
    
    public static void mostrarEnMay(String frase){
        System.out.println("Frase ingresada en Mayusculas: " + frase.toUpperCase());
    }
    
    public static void mostrarEnMin(String frase){
        System.out.println("Frase ingresada en Minusculas: " + frase.toLowerCase());
    }
}
